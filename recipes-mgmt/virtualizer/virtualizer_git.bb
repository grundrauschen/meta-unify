SUMMARY="Intermediate module sitting between un-orchestrator and upper layers of the Unify architecture."
DESCRIPTION="The Virtualizer is an intermediate module sit between the un-orchestrator and the upper layers of the Unify architecture."
LICENSE="CLOSED"

PR="r1"

SRC_URI = "http://nas01/wfailla/unify/virtualizer.tar"

SRC_URI[md5sum] = "4a05571e92baa329991e5ade4a956978"
SRC_URI[sha256sum] = "b0e05c1d527c02b76f071cc56173835d593f9bdf43de6068407fd53ca2304187"

S = "${WORKDIR}/virtualizer"

# SRC_URI += "file://unify-virtualizer.service"
# inherit caros-service
# SYSTEMD_SERVICE_${PN} += "unify-virtualizer.service"

DEPENDS="python-pip"
RDEPENDS_${PN} = "un-orchestrator python-pip gunicorn falcon python-cython python-requests"

do_install() {
	install -m 0755 -d ${D}/opt/virtualizer/virtualizer_library/
	install -m 0755 -d ${D}/opt/virtualizer/un_native_nffg_library/
	install -m 0644 -o 0 -g 0 ${S}/*.py ${D}/opt/virtualizer/
	install -m 0644 -o 0 -g 0 ${S}/virtualizer_library/*.py ${D}/opt/virtualizer/virtualizer_library/
	install -m 0644 -o 0 -g 0 ${S}/un_native_nffg_library/*.py ${D}/opt/virtualizer/un_native_nffg_library/
	
	# install -d ${D}${systemd_unitdir}/system
	# install -m 0644 ${WORKDIR}/unify-virtualizer.service ${D}${systemd_unitdir}/system/
}

FILES_${PN} = "/opt/virtualizer"

# RUN V:
# gunicorn -b ip:port virtualizer:api
# where 'ip' and 'port' must be set to the desired values.
# Please, note that the Virtualizer requires the un-orchestrator and the
# name-resolver running in the server.
#
# TODO:
# * service file
# * recipies for dependencies maybe install all unsing python-pip
#   * gnunicorn
#     * http://gunicorn.org/
#   * falcon
#     * https://falconframework.org/
#     * https://falcon.readthedocs.io/en/latest/user/install.html
#   * cython
#     * http://cython.org/#documentation
#     * http://docs.cython.org/src/quickstart/install.html
