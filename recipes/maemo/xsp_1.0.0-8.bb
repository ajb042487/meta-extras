DESCRIPTION = "X Server Nokia 770 extensions library"
SECTION = "x11/libs"
PRIORITY = "optional"
LICENSE= "MIT"
DEPENDS = "virtual/libx11 libxext xpext"

PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/maemo/ossw/source/x/xsp/${PN}_${PV}.tar.gz"
S = "${WORKDIR}/Xsp"

inherit autotools pkgconfig
