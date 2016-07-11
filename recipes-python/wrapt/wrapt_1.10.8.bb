SUMMARY="wrapt"
DESCRIPTION="A Python module for decorators, wrappers and monkey patching"
LICENSE="unknown"

PR="r0"

SRC_URI = "https://pypi.python.org/packages/00/dd/dc22f8d06ee1f16788131954fc69bc4438f8d0125dd62419a43b86383458/wrapt-1.10.8.tar.gz#md5=7c2a7e6262acc396ef6528b3d66bd047"

SRC_URI[md5sum] = "7c2a7e6262acc396ef6528b3d66bd047"
SRC_URI[sha256sum] = "4ea17e814e39883c6cf1bb9b0835d316b2f69f0f0882ffe7dad1ede66ba82c73"

DEPENDS="python-pip"
RDEPENDS_${PN} = "python-pip"

FILES_${PN} = "/usr/local/lib/python2.7/dist-packages/wrapt \
  /usr/local/lib/python2.7/dist-packages/wrapt_1.10.8.egg-info \
  /usr/local/bin"

do_install() {
  pip install -U ${S} --root ${D}
}
