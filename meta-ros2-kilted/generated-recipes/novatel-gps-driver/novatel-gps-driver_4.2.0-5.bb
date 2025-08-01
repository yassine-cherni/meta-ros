# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_kilted
inherit ros_superflore_generated

DESCRIPTION = "Driver for NovAtel receivers"
AUTHOR = "P. J. Reed <preed@swri.org>"
HOMEPAGE = "https://github.com/swri-robotics/novatel_gps_driver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "novatel_gps_driver"
ROS_BPN = "novatel_gps_driver"

ROS_BUILD_DEPENDS = " \
    boost \
    diagnostic-msgs \
    diagnostic-updater \
    gps-msgs \
    libpcap \
    nav-msgs \
    novatel-gps-msgs \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    std-msgs \
    swri-math-util \
    swri-roscpp \
    swri-serial-util \
    tf2 \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    diagnostic-msgs \
    diagnostic-updater \
    gps-msgs \
    libpcap \
    nav-msgs \
    novatel-gps-msgs \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    std-msgs \
    swri-math-util \
    swri-roscpp \
    swri-serial-util \
    tf2 \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    diagnostic-msgs \
    diagnostic-updater \
    gps-msgs \
    libpcap \
    nav-msgs \
    novatel-gps-msgs \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    std-msgs \
    swri-math-util \
    swri-roscpp \
    swri-serial-util \
    tf2 \
    tf2-geometry-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-index-cpp \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/novatel_gps_driver-release/archive/release/kilted/novatel_gps_driver/4.2.0-5.tar.gz
ROS_BRANCH ?= "branch=release/kilted/novatel_gps_driver"
SRC_URI = "git://github.com/ros2-gbp/novatel_gps_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "31a839c93dae712c94fd46ab55e533bfba038b4e"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
