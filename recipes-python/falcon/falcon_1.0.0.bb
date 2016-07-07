SUMMARY="Falcon is a high-performance Python framework for building cloud APIs."
DESCRIPTION="Falcon is a high-performance Python framework for building cloud APIs. It encourages the REST architectural style, and tries to do as little as possible while remaining highly effective."

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ff6d629144a6ec1ea8c300f75760184f"

PR="r0"

SRC_URI = "https://github.com/falconry/falcon/archive/${PV}.tar.gz"

SRC_URI[md5sum] = "4b6966e3af362bb4b0043fb6d9b97272"
SRC_URI[sha256sum] = "18532f28d92e8a3b3097285a986c8bc2ec4573efcd965c85c3fe433b37e65dc4"

DEPENDS="python-pip"
RDEPENDS_${PN} = "python-pip"

do_install() {
  pip install -U ${S} --root ${D}
}
