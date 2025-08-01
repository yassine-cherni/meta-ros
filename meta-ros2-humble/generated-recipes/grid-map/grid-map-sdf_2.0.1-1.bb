# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Generates signed distance fields from grid maps."
AUTHOR = "Maximilian Wulf <mwulf@anybotics.com>"
ROS_AUTHOR = "Takahiro Miki <takahiro.miki1992@gmail.com>"
HOMEPAGE = "http://github.com/anybotics/grid_map"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "grid_map"
ROS_BPN = "grid_map_sdf"

ROS_BUILD_DEPENDS = " \
    grid-map-cmake-helpers \
    grid-map-core \
    pcl \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    grid-map-core \
    pcl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    grid-map-core \
    pcl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/grid_map-release/archive/release/humble/grid_map_sdf/2.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/grid_map_sdf"
SRC_URI = "git://github.com/ros2-gbp/grid_map-release;${ROS_BRANCH};protocol=https"
SRCREV = "f7b980253f874b202a586f7931a8a8289a86f844"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
