DESCRIPTION = "LIRC is a package that allows you to decode and send infra-red signals of many commonly used remote controls."
SECTION = "console/network"
PRIORITY = "optional"
LICENSE = "GPL"
DEPENDS = "virtual/kernel virtual/libx11 libxau libsm libice"
PR = "r5"

SRC_URI = "${SOURCEFORGE_MIRROR}/lirc/lirc-${PV}.tar.gz \
      file://lircd.init file://lircmd.init"
S = "${WORKDIR}/lirc-${PV}"

inherit autotools module-base update-rc.d

INITSCRIPT_NAME = "lircd"
INITSCRIPT_PARAMS = "defaults 20"

include lirc-config.inc

EXTRA_OEMAKE = 'SUBDIRS="daemons tools"'

do_install_append() {
	install -d ${D}${sysconfdir}/init.d
	install ${WORKDIR}/lircd.init ${D}${sysconfdir}/init.d/lircd

        install -d ${D}${datadir}/lirc/
        cp -pPR ${S}/remotes ${D}${datadir}/lirc/
}

PACKAGES =+ "lirc-x"

FILES_lirc-x = "${bindir}/irxevent ${bindir}/xmode2"
