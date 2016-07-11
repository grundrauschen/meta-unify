SUMMARY="django rest framework"
DESCRIPTION="Web APIs for Django, made easy"
LICENSE="BSD"

PR="r0"

SRC_URI = "https://pypi.python.org/packages/23/9c/94812ea7a7bd95af5439ab95795c03b6757a0cad30e751320f80799c8038/djangorestframework-3.3.3.tar.gz#md5=6f5ee9646e7fa87dad4385d3c7e7678d"

SRC_URI[md5sum] = "6f5ee9646e7fa87dad4385d3c7e7678d"
SRC_URI[sha256sum] = "f606f2bb4e9bb320937cb6ccce299991b2d302f5cc705a671dffca491e55935c"

DEPENDS="python-pip"
RDEPENDS_${PN} = "python-pip"

FILES_${PN} = "/usr/local/lib/python2.7/dist-packages/djangorestframework \
  /usr/local/lib/python2.7/dist-packages/djangorestframework-3.3.3.egg-info \
  /usr/local/bin"

do_install() {
  pip install -U ${S} --root ${D}
}
