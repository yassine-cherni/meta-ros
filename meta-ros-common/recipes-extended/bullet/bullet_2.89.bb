# Copyright (c) 2020 LG Electronics, Inc.

DESCRIPTION = "Real-time collision detection and multi-physics simulation"
HOMEPAGE = "https://github.com/bulletphysics/bullet3"
SECTION = "devel"
LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=74f06ab3011994d1b43d71ecbb42a7cf"

SRCREV = "830f0a9565b1829a07e21e2f16be2aa9966bd28c"
SRC_URI = "git://github.com/bulletphysics/bullet3;protocol=https;branch=master"

inherit cmake

EXTRA_OECMAKE = "-DUSE_DOUBLE_PRECISION=ON -DCMAKE_BUILD_TYPE=Release"
EXTRA_OECMAKE += "-DBUILD_SHARED_LIBS=ON -DINSTALL_LIBS=ON -DINSTALL_EXTRA_LIBS=ON"
EXTRA_OECMAKE += "-DCMAKE_POLICY_VERSION_MINIMUM=3.5"

# Tries to link with prebuilt x86 libraries e.g.
# aarch64-oe-linux/9.3.0/ld: skipping incompatible
# aarch64-oe-linux/bullet/2.89-r0/git/examples/ThirdPartyLibs/openvr/bin/linux64/libopenvr_api.so when searching for -lopenvr_api
EXTRA_OECMAKE += "-DBUILD_BULLET2_DEMOS=OFF"

# Fails to find -lBussIK
EXTRA_OECMAKE += "-DBUILD_UNIT_TESTS=OFF"
