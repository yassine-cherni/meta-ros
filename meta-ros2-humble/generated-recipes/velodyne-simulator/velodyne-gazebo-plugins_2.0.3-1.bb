# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Gazebo plugin to provide simulated data from Velodyne laser scanners."
AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
ROS_AUTHOR = "Kevin Hallenbeck"
HOMEPAGE = "http://wiki.ros.org/velodyne_gazebo_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "velodyne_simulator"
ROS_BPN = "velodyne_gazebo_plugins"

ROS_BUILD_DEPENDS = " \
    gazebo-msgs \
    gazebo-ros \
    gazebo-rosdev \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    gazebo-msgs \
    gazebo-ros \
    gazebo-rosdev \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-msgs \
    gazebo-ros \
    gazebo-rosdev \
    rclcpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/velodyne_simulator-release/archive/release/humble/velodyne_gazebo_plugins/2.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/velodyne_gazebo_plugins"
SRC_URI = "git://github.com/ros2-gbp/velodyne_simulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "9bd6c3eb7da9490d80492e378b195389ed61fd91"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
