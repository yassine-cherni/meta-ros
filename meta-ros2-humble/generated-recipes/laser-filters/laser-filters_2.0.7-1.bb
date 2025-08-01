# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Assorted filters designed to operate on 2D planar laser scanners,     which use the sensor_msgs/LaserScan type."
AUTHOR = "Jon Binney <jon.binney@gmail.com>"
ROS_AUTHOR = "Tully Foote"
HOMEPAGE = "http://ros.org/wiki/laser_filters"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "laser_filters"
ROS_BPN = "laser_filters"

ROS_BUILD_DEPENDS = " \
    ament-cmake-auto \
    angles \
    filters \
    laser-geometry \
    message-filters \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    sensor-msgs \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    angles \
    filters \
    laser-geometry \
    message-filters \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    sensor-msgs \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    filters \
    laser-geometry \
    message-filters \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    sensor-msgs \
    tf2 \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/laser_filters-release/archive/release/humble/laser_filters/2.0.7-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/laser_filters"
SRC_URI = "git://github.com/ros2-gbp/laser_filters-release;${ROS_BRANCH};protocol=https"
SRCREV = "ddf92596b77e02474d56200a1c2043d7a6b2114e"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
