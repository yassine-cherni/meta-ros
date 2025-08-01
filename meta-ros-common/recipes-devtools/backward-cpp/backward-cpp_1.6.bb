LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=74ea9734864a5514a5d672f385e3b382"

SRC_URI = "git://github.com/bombela/backward-cpp.git;protocol=https;branch=master"

SRCREV = "3bb9240cb15459768adb3e7d963a20e1523a6294"


DEPENDS = "libunwind elfutils"

inherit cmake

EXTRA_OECMAKE = "-DCMAKE_POLICY_VERSION_MINIMUM=3.5"

FILES:${PN}-dev += "${libdir}/backward/BackwardConfig.cmake"

BBCLASSEXTEND = "native nativesdk"
