# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "ros2_control plugin for Webots"
AUTHOR = "Cyberbotics <support@cyberbotics.com>"
HOMEPAGE = "http://wiki.ros.org/webots_ros2"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "webots_ros2"
ROS_BPN = "webots_ros2_control"

ROS_BUILD_DEPENDS = " \
    controller-manager \
    hardware-interface \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    ros-environment \
    webots-ros2-driver \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-manager \
    hardware-interface \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    webots-ros2-driver \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-manager \
    hardware-interface \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    webots-ros2-driver \
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

# matches with: https://github.com/ros2-gbp/webots_ros2-release/archive/release/rolling/webots_ros2_control/2025.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/webots_ros2_control"
SRC_URI = "git://github.com/ros2-gbp/webots_ros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "2b55cc6319f94d2514dcc70e2194d0a2f9832674"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
