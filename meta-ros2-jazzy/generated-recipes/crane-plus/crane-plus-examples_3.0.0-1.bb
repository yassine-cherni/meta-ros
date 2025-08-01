# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "CRANE+ V2 examples package"
AUTHOR = "RT Corporation <shop@rt-net.jp>"
ROS_AUTHOR = "Shota Aoki <s.aoki@rt-net.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "crane_plus"
ROS_BPN = "crane_plus_examples"

ROS_BUILD_DEPENDS = " \
    crane-plus-control \
    crane-plus-description \
    crane-plus-moveit-config \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    moveit-ros-planning-interface \
    opencv \
    rclcpp \
    tf2-geometry-msgs \
    usb-cam \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    crane-plus-control \
    crane-plus-description \
    crane-plus-moveit-config \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    moveit-ros-planning-interface \
    opencv \
    rclcpp \
    tf2-geometry-msgs \
    usb-cam \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    crane-plus-control \
    crane-plus-description \
    crane-plus-moveit-config \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    moveit-ros-planning-interface \
    opencv \
    rclcpp \
    tf2-geometry-msgs \
    usb-cam \
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

# matches with: https://github.com/ros2-gbp/crane_plus-release/archive/release/jazzy/crane_plus_examples/3.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/crane_plus_examples"
SRC_URI = "git://github.com/ros2-gbp/crane_plus-release;${ROS_BRANCH};protocol=https"
SRCREV = "9f7f59be2a9f18ec34f2269ea893f375cc29e2fb"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
