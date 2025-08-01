# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "NovAtel Oem7 ROS Driver"
AUTHOR = "NovAtel Support <support.novatel@hexagon.com>"
HOMEPAGE = "http://www.novatel.com"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "novatel_oem7_driver"
ROS_BPN = "novatel_oem7_driver"

ROS_BUILD_DEPENDS = " \
    boost \
    geographiclib \
    gps-msgs \
    nav-msgs \
    nmea-msgs \
    novatel-oem7-msgs \
    pluginlib \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    git-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    geographiclib \
    gps-msgs \
    nav-msgs \
    nmea-msgs \
    novatel-oem7-msgs \
    pluginlib \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    geographiclib \
    gps-msgs \
    nav-msgs \
    nmea-msgs \
    novatel-oem7-msgs \
    pluginlib \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2-geometry-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    launch-testing \
    launch-testing-ament-cmake \
    launch-testing-ros \
    rclpy \
    rosbag2 \
    rosidl-runtime-py \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/novatel-gbp/novatel_oem7_driver-release/archive/release/jazzy/novatel_oem7_driver/24.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/novatel_oem7_driver"
SRC_URI = "git://github.com/novatel-gbp/novatel_oem7_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "20aff52b8d2e58e37116965e2c8f49d7a8f58819"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
