DESCRIPTION = "X Server Nokia 770 extensions library"
LICENSE= "MIT"
SECTION = "x11/libs"
PRIORITY = "optional"
DEPENDS = "virtual/libx11 libxext"
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/maemo/ossw/source/x/${PN}/${PN}_${PV}.tar.gz \
           file://auxdir.patch;patch=1;pnum=0"
S = "${WORKDIR}/xpext-1.0"

# ${PN} is empty so we need to tweak -dev and -dbg package dependencies
RDEPENDS_${PN}-dev = ""
RRECOMMENDS_${PN}-dbg = "${PN}-dev (= ${EXTENDPV})"

inherit autotools pkgconfig

do_configure_prepend () {
  cd ${S}
  chmod +x ./autogen.sh
  ./autogen.sh
}
