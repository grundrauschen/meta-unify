SUMMARY="django web framework"
DESCRIPTION="Django is a high-level Python Web framework that encourages rapid development and clean, pragmatic design"
LICENSE="3-clause BSD"

PR="r0"

SRC_URI = "https://www.djangoproject.com/download/${PV}/tarball"

SRC_URI[md5sum] = "ec4330cd275dd6ce64230feebcb449c4"
SRC_URI[sha256sum] = "3bb60536b2fb2084612fc9486634295e7208790029081842524916b5a66d206f"

DEPENDS="python-pip"
RDEPENDS_${PN} = "python-pip"

FILES_${PN} = "/usr/local/lib/python2.7/dist-packages/django \
  /usr/local/lib/python2.7/dist-packages/django-1.8.2.egg-info \
  /usr/local/bin"

do_install() {
  pip install -U ${S} --root ${D}
}
