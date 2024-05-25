
package com.dzboot.ovpn.constants

import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
object Constants {

    fun isNotSet() =
            CLIENT_CERT.isBlank() || CLIENT_CERT.equals("{client_key}", true) ||
                    CA_CERT.isBlank() || CA_CERT.equals("{ca_cert}", true) ||
                    CLIENT_CERT.isBlank() || CLIENT_CERT.equals("{client_cert}", true) ||
                    TA.isBlank() || TA.equals("{ta}", true)

    val CLIENT_KEY = """-----BEGIN PRIVATE KEY-----
MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDoOFfvkSv4ycZ5
0riMIRVAf8XBhOn4nocSqg+vmr0SdmxB9YstNsLAKc5Ce2IYZ3f0CgsnYZgIYX3Q
AJ4CTAAW7DM+9NnYnUZGMvkpEHixKerP/R0xp5tiK4MXlS42jNTz4aHaR80MZBkw
+gjHfvMXBMahhAeE6nMIsQoVKvLD0ENTvlxpkwItgLX57MLuNOJxi8ymjzxeDaXa
SnAyZXQ6441BXgjxV+9TK98fLLWee3awMp/DNYv/9kLRgQa77T4SKejP/oxkRjXX
2B9RjzCbOmhuu7jRKeiBoikvvRFaugDT2z7uMHXqyR4svyQ/BCGdqf6G0K2vUjh8
uQ5CNZMTAgMBAAECggEBANuc5XTYCwjG8iAl64gChZGxBLnGVGteqQk6sYj2Qxch
zbH3YH8LCdUn9DulahkASU4O7Yt53YkXgh9jZgtwCqmjCbfhYeBcpKgg7sgqHqoV
pU675o8eHnISCnEUEVdfisl2OlYvjzjHtZc+72yTn5vGVX9MWLwX6WBv5cQtENei
4Z6dMFnzm3AFChTySi5viGk/uJgU8bXVXKKcBzAFcnYi35/vUXHNrcDKcKwBkUhp
rPRYhg0OKcjlOL9cTz/zgYnrIlBVeeHSEmhCMLU3eYhZaTopY5SEgepGktgYYvXw
pSB99568BId6sOcN492+zDfSeYSRp7e5EDm9ChdNbPECgYEA+r7nWn/3nYuS11vM
yecsxiJNz6myVYSweUlORFy73mDEPlIFZDdBnffQJYPj6EjxwNgj911OsCbzTV9f
T+lN5XB34iaA4qsIQLX8NcjBr18P7iJyBs2SrT67ZPjS9RmbIViuXYZ4a4S1p61j
b1MCQ67Gyj1pJm3SpU9sh9e4NzsCgYEA7RYPqzsQO65MP+GRtTHMogy3hMBvxLMY
YC0bxRX3bOvS7eye04DnrLdHvoUba3rsMd9aj6RZUVzDl1b9ipwKMLBIBH3dukgB
pe8bH99mjxoC+d0vW07zOg9uG5lqg0pvtIpmUmo8X9nmkl/0ljJ3MBbI3PLWjqoO
llEgDJ3MxgkCgYATAPr50e8LYrOrXMrFlp6/GYR6M6tPbfIODy8+YSTf8seMzZyY
/tMbTNfasAdK6JRiAD+hlNHM6fbQq2TG4rDDreV4H2DvTPUgKmrGDMQZLYRAkR3B
RD1UogeD3JPofZtTSKxWbEWeKH24Cp0Zp9npFUr9su/QOMyZOM7J8OCGVwKBgQDS
aAvL2QUVEiCVaOjZN7L19fdAl1AZ7x+o6x+ED3Sgc8GkaaSi6/mvbJD9Yj/taRAJ
SsGiTSb/cCYdP5SP2N+qSif/5HxM/+6Ghuc5qBfq1BjkCwomLLDrTBpZ4BOJJRxx
y4n3hlTCdC2Oph341hy0zuPAQrtrrTx45tJcoAbFkQKBgG35eHexrCZww5pcvL7X
G98jwJ8tes5UNMIIqct5lVk+lkE/YVnEx+9AD0laxi28yKq11BxEtOACfwMfn3Dp
KY/6EaW+vf/RGIxP/9e+dF1JSJfcnI7l6y6/0jVcUBX4QY0a5FypmA19bQhWsy90
8FIJIkzMlgQ/sE2uTWZGA9Jk
-----END PRIVATE KEY-----"""
    val CA_CERT = """-----BEGIN CERTIFICATE-----
MIIDNjCCAh6gAwIBAgIUaGhPCcHlUFBE3ai5msMvczW8A/swDQYJKoZIhvcNAQEL
BQAwDzENMAsGA1UEAwwEb3ZwbjAeFw0yMjEyMTEwODAwMzBaFw0zMjEyMDgwODAw
MzBaMA8xDTALBgNVBAMMBG92cG4wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEK
AoIBAQDPYyRrBXnEDq0RCpRNXT/30ciIzm95EA84lW8mqpZctOpKaLUb0Kv1G56Y
xpLBUINw6xOI4Ssb+cUHUJPFmZMapkhadov2Ru9TcLuuT/BdsnuoODub4f0XwvB+
jaolEahsjCkwQ0GY+rUtKyf7p5sEpClZ5OJ7m4IKdkipoTXrahmwRhgHxGdxCO32
OzCbZKxHCdJj0A1TOVkRXtrc0a/stTW78LdgsluWtzifduH5F59vasy63f40v80H
RB8oGjgCjU13A/KXOf/x6OvWCIB7TgXW8I7YKGiaxAWZ77aIdZEDlUExxdfIFEB1
EOLBTgSBau9sPO5i/DJ6sDuwwcBfAgMBAAGjgYkwgYYwHQYDVR0OBBYEFFU5fl9k
ARRPYgRkVSjFYlC+sk9sMEoGA1UdIwRDMEGAFFU5fl9kARRPYgRkVSjFYlC+sk9s
oROkETAPMQ0wCwYDVQQDDARvdnBughRoaE8JweVQUETdqLmawy9zNbwD+zAMBgNV
HRMEBTADAQH/MAsGA1UdDwQEAwIBBjANBgkqhkiG9w0BAQsFAAOCAQEAilWB/o6I
5duT88IFlh65+8gkP8wSjZknFS/dCiYuXtxVSk2uE73wiewjx7II7Ku2vqbPQZHZ
JQosF7SxwUavpwbd75dH1b35SJbgNMlZg1xfxIuc3F1SEaqlM9Mc1LnMG1ZHlEOt
lmk8WVh+0ACApeOjJ0dMAKZwkKeiOQcFzBPtj4GRYAx21UIC0tid7ltdtG0zZ7yV
7LiFxKhYMb1yVS6hpu8leMmZ/Xlj4j7cTV5zLtYW9KD/9zK95SDtnAfBAD6W4aXw
sqa+SPdcsz437N5ltt86m7b3pAAnYYkA9fqILNb3O7ogjRP37rSIKOB86BWFvf/b
iU6YkiAb0zA+OQ==
-----END CERTIFICATE-----"""
    val CLIENT_CERT = """Certificate:
    Data:
        Version: 3 (0x2)
        Serial Number:
            42:08:b6:c3:fb:8f:3e:6f:b2:f8:b0:18:ef:81:d0:a9
        Signature Algorithm: sha256WithRSAEncryption
        Issuer: CN=ovpn
        Validity
            Not Before: Dec 11 08:00:31 2022 GMT
            Not After : Mar 15 08:00:31 2025 GMT
        Subject: CN=ovpn
        Subject Public Key Info:
            Public Key Algorithm: rsaEncryption
                RSA Public-Key: (2048 bit)
                Modulus:
                    00:e8:38:57:ef:91:2b:f8:c9:c6:79:d2:b8:8c:21:
                    15:40:7f:c5:c1:84:e9:f8:9e:87:12:aa:0f:af:9a:
                    bd:12:76:6c:41:f5:8b:2d:36:c2:c0:29:ce:42:7b:
                    62:18:67:77:f4:0a:0b:27:61:98:08:61:7d:d0:00:
                    9e:02:4c:00:16:ec:33:3e:f4:d9:d8:9d:46:46:32:
                    f9:29:10:78:b1:29:ea:cf:fd:1d:31:a7:9b:62:2b:
                    83:17:95:2e:36:8c:d4:f3:e1:a1:da:47:cd:0c:64:
                    19:30:fa:08:c7:7e:f3:17:04:c6:a1:84:07:84:ea:
                    73:08:b1:0a:15:2a:f2:c3:d0:43:53:be:5c:69:93:
                    02:2d:80:b5:f9:ec:c2:ee:34:e2:71:8b:cc:a6:8f:
                    3c:5e:0d:a5:da:4a:70:32:65:74:3a:e3:8d:41:5e:
                    08:f1:57:ef:53:2b:df:1f:2c:b5:9e:7b:76:b0:32:
                    9f:c3:35:8b:ff:f6:42:d1:81:06:bb:ed:3e:12:29:
                    e8:cf:fe:8c:64:46:35:d7:d8:1f:51:8f:30:9b:3a:
                    68:6e:bb:b8:d1:29:e8:81:a2:29:2f:bd:11:5a:ba:
                    00:d3:db:3e:ee:30:75:ea:c9:1e:2c:bf:24:3f:04:
                    21:9d:a9:fe:86:d0:ad:af:52:38:7c:b9:0e:42:35:
                    93:13
                Exponent: 65537 (0x10001)
        X509v3 extensions:
            X509v3 Basic Constraints: 
                CA:FALSE
            X509v3 Subject Key Identifier: 
                DF:17:15:D9:2A:26:CB:94:B2:2C:0C:11:60:33:D4:DA:F4:F6:E1:A7
            X509v3 Authority Key Identifier: 
                keyid:55:39:7E:5F:64:01:14:4F:62:04:64:55:28:C5:62:50:BE:B2:4F:6C
                DirName:/CN=ovpn
                serial:68:68:4F:09:C1:E5:50:50:44:DD:A8:B9:9A:C3:2F:73:35:BC:03:FB

            X509v3 Extended Key Usage: 
                TLS Web Client Authentication
            X509v3 Key Usage: 
                Digital Signature
    Signature Algorithm: sha256WithRSAEncryption
         76:45:d7:be:ce:3c:cf:bc:55:3e:53:f7:b3:96:11:a7:e1:9e:
         50:e7:48:be:ad:8b:b1:a4:f7:2f:69:44:8d:d7:ce:70:84:0c:
         53:40:3c:07:03:4e:79:cc:3e:ec:39:4f:52:b5:b6:18:7c:76:
         0c:b9:d1:45:26:02:6c:84:82:e6:4e:ab:5f:d6:f6:39:9e:29:
         a9:d8:fa:e5:01:20:76:22:ce:15:06:ce:5a:2d:15:8d:9e:a9:
         94:44:70:ec:de:8f:fb:6f:d2:b2:49:e2:97:4e:0d:56:30:b1:
         f1:5b:a2:78:9a:9e:e4:f3:95:47:e4:4b:09:36:cb:e1:97:a9:
         19:91:5b:c4:6a:df:f0:67:db:4a:e3:dd:53:78:7b:9c:20:5a:
         e4:49:80:09:61:4f:a5:33:02:0f:10:b2:b0:e7:e6:d0:db:25:
         07:eb:b8:f4:31:af:bb:15:9a:93:6a:0a:de:ab:2f:93:ca:03:
         38:cb:2f:a7:41:04:fc:ea:5d:95:9f:31:54:14:74:c6:23:c7:
         7e:02:cd:88:ea:d4:c1:7a:05:32:28:8b:8b:bd:5f:8a:13:72:
         1f:09:37:9c:ca:73:e4:2c:ca:b5:a8:43:9a:f3:99:47:0f:70:
         7e:73:5f:f0:ef:d2:76:48:19:35:3e:f0:da:d5:66:a7:56:70:
         7f:7d:52:07
-----BEGIN CERTIFICATE-----
MIIDRDCCAiygAwIBAgIQQgi2w/uPPm+y+LAY74HQqTANBgkqhkiG9w0BAQsFADAP
MQ0wCwYDVQQDDARvdnBuMB4XDTIyMTIxMTA4MDAzMVoXDTI1MDMxNTA4MDAzMVow
DzENMAsGA1UEAwwEb3ZwbjCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEB
AOg4V++RK/jJxnnSuIwhFUB/xcGE6fiehxKqD6+avRJ2bEH1iy02wsApzkJ7Yhhn
d/QKCydhmAhhfdAAngJMABbsMz702didRkYy+SkQeLEp6s/9HTGnm2IrgxeVLjaM
1PPhodpHzQxkGTD6CMd+8xcExqGEB4TqcwixChUq8sPQQ1O+XGmTAi2Atfnswu40
4nGLzKaPPF4NpdpKcDJldDrjjUFeCPFX71Mr3x8stZ57drAyn8M1i//2QtGBBrvt
PhIp6M/+jGRGNdfYH1GPMJs6aG67uNEp6IGiKS+9EVq6ANPbPu4wderJHiy/JD8E
IZ2p/obQra9SOHy5DkI1kxMCAwEAAaOBmzCBmDAJBgNVHRMEAjAAMB0GA1UdDgQW
BBTfFxXZKibLlLIsDBFgM9Ta9PbhpzBKBgNVHSMEQzBBgBRVOX5fZAEUT2IEZFUo
xWJQvrJPbKETpBEwDzENMAsGA1UEAwwEb3ZwboIUaGhPCcHlUFBE3ai5msMvczW8
A/swEwYDVR0lBAwwCgYIKwYBBQUHAwIwCwYDVR0PBAQDAgeAMA0GCSqGSIb3DQEB
CwUAA4IBAQB2Rde+zjzPvFU+U/ezlhGn4Z5Q50i+rYuxpPcvaUSN185whAxTQDwH
A055zD7sOU9StbYYfHYMudFFJgJshILmTqtf1vY5nimp2PrlASB2Is4VBs5aLRWN
nqmURHDs3o/7b9KySeKXTg1WMLHxW6J4mp7k85VH5EsJNsvhl6kZkVvEat/wZ9tK
491TeHucIFrkSYAJYU+lMwIPELKw5+bQ2yUH67j0Ma+7FZqTagreqy+TygM4yy+n
QQT86l2VnzFUFHTGI8d+As2I6tTBegUyKIuLvV+KE3IfCTecynPkLMq1qEOa85lH
D3B+c1/w79J2SBk1PvDa1WanVnB/fVIH
-----END CERTIFICATE-----"""
    val TA = """#
# 2048 bit OpenVPN static key
#
-----BEGIN OpenVPN Static key V1-----
f783bbffb7842aaef57c1804691e6682
aeebca61555db03aa398db5993c10254
32976641ef2ed5c5e3e97a49dca29440
f583f95034dd28ca1b0de2975493971a
c9eb447e58f737abc8ab1f575f3cc094
c06c55e0840d811b610014998145460c
cb76588cec6fbf5f53c616a5ab0a7265
8014d1d6f487e1b92e3cd621a318041d
8280558b0c6f203cc29e9d7050be040b
5a33347144fe840a73b895f967108895
69119137bc6d320ef50a1d472a245ea2
fc507f926fbacd932cbfc74c13136ddc
48a644cce0c0ad17670e2020e58ede30
7b8dbfcade3efbad75c2af3977a57de8
a031644718d76de9cc7f9a5169deed3f
63484a84cc4a62f513444a997f9f0242
-----END OpenVPN Static key V1-----"""

    val PUBLIC_KEY = """-----BEGIN PUBLIC KEY-----
MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDAYiKRGH0zbQScACFQNNLgIDIs
zfvKnQNE9awI8fmcKCn/ZfpRF7xiNwDAkZlfPqF/GlPP8FTuVkD55oyX/HqxxYAq
sSCgz96v05clz4pKSrf4N35yvD8jZhMJakFJ5myORdOjC3o2VDlK6LZYMJMvF+ME
yu0/p5wKFLutRF8EpwIDAQAB
-----END PUBLIC KEY-----"""
    val API_KEY = """YeNvUtVhMkOqNTAtpkMx"""

}

                        