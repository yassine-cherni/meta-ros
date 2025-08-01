# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "A set of ROS 2 message filters which take in messages and may output those messages at a later time, based on the conditions that filter needs met."
AUTHOR = "Geoffrey Biggs <geoff@openrobotics.org>"
ROS_AUTHOR = "Dirk Thomas"
HOMEPAGE = "https://github.com/intel/ros2_message_filters"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "message_filters"
ROS_BPN = "message_filters"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rcutils \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-python-native \
    ament-cmake-ros-native \
    python-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
    rcutils \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    rclcpp \
    rclpy \
    rcutils \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    rclcpp-lifecycle \
    sensor-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros2_message_filters-release/archive/release/jazzy/message_filters/4.11.6-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/message_filters"
SRC_URI = "git://github.com/ros2-gbp/ros2_message_filters-release;${ROS_BRANCH};protocol=https"
SRCREV = "1fbaa82f98f66ff9c6b47ffa8ac7d9a1a77087c4"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
