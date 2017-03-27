DESCRIPTION = "redsocks - transparent socks redirector"
SECTION = "net/misc"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${RESIN_COREBASE}/COPYING.Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRCREV = "27b17889a43e32b0c1162514d00967e6967d41bb"

SRC_URI = "git://github.com/darkk/redsocks.git"

DEPENDS = "libevent"

S = "${WORKDIR}/git"

do_install () {
    install -d ${D}${bindir}
    install -m 0775 ${S}/redsocks ${D}${bindir}/redsocks
}
