# Copyright (c) 2024 Wind River Systems, Inc.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a461be67a1edf991251f85f3aadd1d0 \
                    file://profiler/src/Remotery/LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "git://github.com/gazebosim/gz-common.git;protocol=https;branch=gz-common5 \
           file://add-missing-headers.patch \
           file://added-missing-includes.patch"

SRCREV = "9d775ab82cf8284d9078e0b1b58e22b87c177e61"


inherit cmake pkgconfig

# CMake Error: TRY_RUN() invoked in cross-compiling mode, please set the following cache variables appropriately:
#    FREEIMAGE_RUNS (advanced)
#    FREEIMAGE_RUNS__TRYRUN_OUTPUT (advanced)
EXTRA_OECMAKE += " -DFREEIMAGE_RUNS=1 -DFREEIMAGE_RUNS__TRYRUN_OUTPUT=0"

DEPENDS = " \
    assimp \
    cppcheck-native \
    doxygen-native \
    gdal \
    graphviz-native \
    gz-cmake3 \
    gz-math7 \
    gz-utils2 \
    gts \
    ffmpeg \
    freeimage \
    libtinyxml2 \
    util-linux \
"

do_install:append() {
    # Remove references to the build directory in the Doxygen tagfile
    sed -i -e "s:${S}::g" ${D}${datadir}/gz/gz-common5/gz-common5.tag.xml
}

FILES:${PN} += " \
    ${datadir}/gz/gz-common5/profiler_vis/* \
    ${datadir}/gz/gz-common5/gz-common5.tag.xml \
"

BBCLASSEXTEND = "native nativesdk"
