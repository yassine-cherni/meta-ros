# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "C++ action server exposing a non-systematic coverage behavior"
AUTHOR = "Alberto Soragna <asoragna@irobot.com>"
ROS_AUTHOR = "Alberto Soragna <asoragna@irobot.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "create3_examples"
ROS_BPN = "create3_coverage"

ROS_BUILD_DEPENDS = " \
    create3-examples-msgs \
    geometry-msgs \
    irobot-create-msgs \
    nav-msgs \
    rclcpp \
    rclcpp-action \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    create3-examples-msgs \
    geometry-msgs \
    irobot-create-msgs \
    nav-msgs \
    rclcpp \
    rclcpp-action \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    create3-examples-msgs \
    geometry-msgs \
    irobot-create-msgs \
    nav-msgs \
    rclcpp \
    rclcpp-action \
    tf2-geometry-msgs \
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

# matches with: https://github.com/ros2-gbp/create3_examples-release/archive/release/jazzy/create3_coverage/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/create3_coverage"
SRC_URI = "git://github.com/ros2-gbp/create3_examples-release;${ROS_BRANCH};protocol=https"
SRCREV = "dadf03e2365f6d573bb83d0e85c2469915c8c12b"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
