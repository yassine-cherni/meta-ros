# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_kilted
inherit ros_superflore_generated

DESCRIPTION = "ROS wrapper for lely-core-libraries"
AUTHOR = "Christoph Hellmann Santos <christoph.hellmann.santos@ipa.fraunhofer.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "ros2_canopen"
ROS_BPN = "lely_core_libraries"

ROS_BUILD_DEPENDS = " \
    autoconf \
    automake \
    git \
    libtool \
    python3-empy \
    python3-pyyaml \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    python3-empy \
    python3-pyyaml \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python3-empy \
    python3-pyyaml \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros2_canopen-release/archive/release/kilted/lely_core_libraries/0.3.0-2.tar.gz
ROS_BRANCH ?= "branch=release/kilted/lely_core_libraries"
SRC_URI = "git://github.com/ros2-gbp/ros2_canopen-release;${ROS_BRANCH};protocol=https"
SRCREV = "cebddebeaebb775a194a528b06d862fbb8549e44"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
