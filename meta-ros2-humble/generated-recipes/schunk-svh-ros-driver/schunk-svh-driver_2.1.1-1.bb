# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS2-control system interface for the Schunk SVH"
AUTHOR = "Stefan Scherzinger <scherzin@fzi.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=53aea082abed75ae865b3625de94a4e3"

ROS_CN = "schunk_svh_ros_driver"
ROS_BPN = "schunk_svh_driver"

ROS_BUILD_DEPENDS = " \
    hardware-interface \
    pluginlib \
    rclcpp \
    schunk-svh-library \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    hardware-interface \
    pluginlib \
    rclcpp \
    schunk-svh-library \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-manager \
    hardware-interface \
    joint-state-broadcaster \
    joint-trajectory-controller \
    launch \
    launch-ros \
    pluginlib \
    rclcpp \
    ros2launch \
    schunk-svh-description \
    schunk-svh-library \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/schunk_svh_ros_driver-release/archive/release/humble/schunk_svh_driver/2.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/schunk_svh_driver"
SRC_URI = "git://github.com/ros2-gbp/schunk_svh_ros_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "ba9f7ace87db26e192455618f09788bbc05d4d63"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
