# imported from http://git.yoctoproject.org/cgit/cgit.cgi/meta-cloud-services/tree/meta-openstack/recipes-devtools/python/python-virtualenv_1.11.4.bb?h=master

DESCRIPTION = "Virtual Python Environment builder"
HOMEPAGE = "https://pypi.python.org/pypi/virtualenv"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=53df9f8889d6a5fba83f425abe3b1568"

PR = "r0"

SRCNAME = "virtualenv"
SRC_URI = "http://pypi.python.org/packages/source/v/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "9accc2d3f0ec1da479ce2c3d1fdff06e"
SRC_URI[sha256sum] = "cf3d958f28eb7470bd04262ef397580a2e57407f2ee2c88e9b2892218eb0465a"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

DEPENDS += " \
        python-pip \
        "

RDEPENDS_${PN} += " \
        python-dateutil \
        "
