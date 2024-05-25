package com.dzboot.ovpn.helpers

import android.content.Context
import com.dzboot.ovpn.constants.Constants
import com.dzboot.ovpn.data.models.Server
import com.dzboot.ovpn.data.remote.NetworkCaller
import de.blinkt.openvpn.core.Connection
import de.blinkt.openvpn.core.ProfileManager
import de.blinkt.openvpn.core.VpnProfile
import io.michaelrocks.paranoid.Obfuscate
import timber.log.Timber
import java.io.InputStreamReader


@Obfuscate
object ProfileFetcher {

    interface ConnectCallback {
        fun connect()
        fun error(message: String?)
    }

    @Suppress("BlockingMethodInNonBlockingContext")
    suspend fun getProfile(context: Context, server: Server, connectCallback: ConnectCallback) {

        val profile: VpnProfile = if (server.useFile) {
            try {
                val response = NetworkCaller.getApi(context).getServer(server.id)
                val configParser = ConfigParser()
                configParser.parseConfig(InputStreamReader(response.body()!!.byteInputStream()))
                configParser.convertProfile()
            } catch (exception: Exception) {
                Timber.e(exception, "Error parsing profile")
                connectCallback.error("Error parsing profile")
                return
            }
        } else {
            getDefaultProfile(server)
        }

        profile.apply {
            mName = server.getProfileName()
            id = server.id
            mCountryCode = server.countryCode
            mCity = server.city
            mDisallowedAppsVpn = PrefsHelper.getAppsNotUsing()
            ProfileManager.getInstance(context).saveProfile(this)
        }
        connectCallback.connect()
    }

    private fun getDefaultProfile(server: Server) = with(VpnProfile()) {
        Timber.d("Getting default profile")
        clearDefaults()
        mUsePull = true
        mUseTLSAuth = true
        mTLSAuthDirection = "tls-crypt"
        mCipher = "AES-256-GCM"
        mAuth = "SHA256"
        mAuthenticationType = VpnProfile.TYPE_CERTIFICATES
        mVerb = "3"
        mNobind = true
        mPersistTun = true
        mExpectTLSCert = true
        mUsername = null
        mPassword = null

        getConfigValues().let {
            mClientKeyFilename = "[[INLINE]]${it[0]}"
            mCaFilename = "[[INLINE]]${it[1]}"
            mClientCertFilename = "[[INLINE]]${it[2]}"
            mTLSAuthFilename = "[[INLINE]]${it[3]}"
        }

        with(Connection()) {
            mServerName = server.ip
            mServerPort = server.port.toString()
            mUseUdp = server.protocol.equals("udp", true)
            mConnections = arrayOf(this)
        }
        this
    }


    private fun getConfigValues(): List<String> {
        return listOf(Constants.CLIENT_KEY, Constants.CA_CERT, Constants.CLIENT_CERT, Constants.TA)
    }
}