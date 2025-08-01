# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The robotraconteur package"
AUTHOR = "John Wason <wason@wasontech.com>"
ROS_AUTHOR = "John Wason <wason@wasontech.com>"
HOMEPAGE = "http://robotraconteur.com"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=cd41bc11770726765d770973e9991bab"

ROS_CN = "robotraconteur"
ROS_BPN = "robotraconteur"

ROS_BUILD_DEPENDS = " \
    bluez5 \
    boost \
    dbus \
    libusb1 \
    openssl \
    python3 \
    python3-numpy \
    python3-setuptools \
    zlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    bluez5 \
    boost \
    dbus \
    libusb1 \
    openssl \
    python3 \
    python3-numpy \
    python3-setuptools \
    zlib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    bluez5 \
    boost \
    dbus \
    libusb1 \
    openssl \
    python3 \
    python3-numpy \
    python3-setuptools \
    zlib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/robotraconteur-packaging/robotraconteur-ros-release/archive/release/noetic/robotraconteur/1.2.2-3.tar.gz
ROS_BRANCH ?= "branch=release/noetic/robotraconteur"
SRC_URI = "git://github.com/robotraconteur-packaging/robotraconteur-ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "0cab8c688f34cebd45f5a8f432763cb7457442ee"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
