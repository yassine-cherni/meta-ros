# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Helper scripts and functionality to test industrial motion generation"
AUTHOR = "Christian Henkel <c.henkel@pilz.de>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "pilz_industrial_motion_planner_testutils"

ROS_BUILD_DEPENDS = " \
    moveit-common \
    moveit-core \
    moveit-msgs \
    rclcpp \
    tf2-eigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    eigen3-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    moveit-common \
    moveit-core \
    moveit-msgs \
    rclcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    eigen3-cmake-module-native \
"

ROS_EXEC_DEPENDS = " \
    moveit-common \
    moveit-core \
    moveit-msgs \
    rclcpp \
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

# matches with: https://github.com/ros2-gbp/moveit2-release/archive/release/humble/pilz_industrial_motion_planner_testutils/2.5.9-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/pilz_industrial_motion_planner_testutils"
SRC_URI = "git://github.com/ros2-gbp/moveit2-release;${ROS_BRANCH};protocol=https"
SRCREV = "ea809a551d094cec92b9666192ce918dd0028cc0"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
