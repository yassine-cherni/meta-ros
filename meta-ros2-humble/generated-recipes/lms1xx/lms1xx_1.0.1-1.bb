# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "The lms1xx package contains a basic ROS 2 driver for the SICK LMS1xx line of LIDARs."
AUTHOR = "Tony Baltovski <tbaltovski@clearpathrobotics.com>"
ROS_AUTHOR = "Konrad Banachowicz"
HOMEPAGE = "http://ros.org/wiki/LMS1xx"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_CN = "lms1xx"
ROS_BPN = "lms1xx"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    laser-geometry \
    rclcpp \
    sensor-msgs \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    laser-geometry \
    rclcpp \
    sensor-msgs \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    laser-geometry \
    rclcpp \
    sensor-msgs \
    tf2 \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/LMS1xx-release/archive/release/humble/lms1xx/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/lms1xx"
SRC_URI = "git://github.com/clearpath-gbp/LMS1xx-release;${ROS_BRANCH};protocol=https"
SRCREV = "306e91a393ab7b794aba681d6177a0d7b4efdfb3"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
