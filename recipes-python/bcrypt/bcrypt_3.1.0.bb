SUMMARY="bcrypt"
DESCRIPTION="Modern password hashing for your software and your servers"
LICENSE="Apache License, Version 2.0"

PR="r0"

SRC_URI = "https://pypi.python.org/packages/9b/32/1ece045aa19069ca687d5ccd1241e03a70cae157ae908b6aa5b97789e6da/bcrypt-3.1.0.tar.gz#md5=49d79e646dbf27a05b81e4f0c4f717c7"

SRC_URI[md5sum] = "49d79e646dbf27a05b81e4f0c4f717c7"
SRC_URI[sha256sum] = "e54820d8b9eff357d1003f5b8d4b949a632b76b89610d8a933783fd476033ebe"

DEPENDS="python-pip"
RDEPENDS_${PN} = "python-pip"

FILES_${PN} = "/usr/local/lib/python2.7/dist-packages/bcrypt \
  /usr/local/lib/python2.7/dist-packages/bcrypt_3.1.0.egg-info \
  /usr/local/bin"

do_install() {
  pip install -U ${S} --root ${D}
}
