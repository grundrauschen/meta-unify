SUMMARY="django REST Swagger"
DESCRIPTION="Swagger UI for Django REST Framework 2.3.8+"
LICENSE="FreeBSD Licence"

PR="r0"

SRC_URI = "https://pypi.python.org/packages/4c/6f/0122fd5a4b51420fcd7290ee9470f4f90a5cf7288a696d840ed28df22457/django-rest-swagger-0.3.8.tar.gz#md5=1f4bed2789f0b223beeed3a186c249b2"

SRC_URI[md5sum] = "1f4bed2789f0b223beeed3a186c249b2"
SRC_URI[sha256sum] = "48cbd7a138f931fde9d82a6064e053b76cdb82930cfb603a220951837604d3f8"

DEPENDS="python-pip"
RDEPENDS_${PN} = "python-pip"

FILES_${PN} = "/usr/local/lib/python2.7/dist-packages/django-rest-swagger \
  /usr/local/lib/python2.7/dist-packages/django-rest-swagger-0.3.8.egg-info \
  /usr/local/bin"

do_install() {
  pip install -U ${S} --root ${D}
}
