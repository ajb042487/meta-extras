DESCRIPTION = "NetworkManager"
HOMEPAGE = "http://projects.gnome.org/NetworkManager/"
BUGTRACKER = "https://bugzilla.gnome.org/buglist.cgi?query_format=specific&order=relevance+desc&bug_status=__open__&product=NetworkManager&content="
SECTION = "net/misc"
LICENSE = "GPLv2+ & LGPLv2+"
PRIORITY = "optional"
DEPENDS = "libnl dbus dbus-glib hal gconf-dbus wireless-tools ppp gnome-common polkit"
RDEPENDS = "hal wpa-supplicant iproute2 dhcp-client"

PV = "0.7+svnr${SRCREV}"
PR = "r10"

SRC_URI="svn://svn.gnome.org/svn/NetworkManager/;module=trunk;proto=http \
         file://no-restarts.diff;patch=1;pnum=0 \
         file://libnlfix.patch;patch=1 \
         file://makefile-fix.patch;patch=1 \
         file://allow-disabling.patch;patch=1 \
         file://NetworkManager \
         file://99_networkmanager"

EXTRA_OECONF = "--with-distro=debian \
                --with-ip=/sbin/ip"
# TODO: will /bin/ip from busybox do?

S = "${WORKDIR}/trunk"

inherit autotools pkgconfig update-rc.d

INITSCRIPT_NAME = "NetworkManager"
INITSCRIPT_PARAMS = "defaults 22"

do_install_append () {
	install -d ${D}/etc/default/volatiles
	install -m 0644 ${WORKDIR}/99_networkmanager ${D}/etc/default/volatiles
        # This overwrites the provided init script
	install -m 0755 ${WORKDIR}/NetworkManager ${D}/etc/init.d/
	rmdir ${D}/var/run/NetworkManager
	rmdir ${D}/var/run
}

PACKAGES =+ "libnmutil libnmglib"

FILES_libnmutil += "${libdir}/libnm-util.so.*"

FILES_libnmglib += "${libdir}/libnm_glib.so.*"

FILES_${PN}-dev = "${includedir}/* \
                   ${libdir}/*.so \
                   ${libdir}/*.a \
                   ${libdir}/pkgconfig/*.pc \
                   ${datadir}/NetworkManager/gdb-cmd"
