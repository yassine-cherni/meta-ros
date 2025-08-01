# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "The dwb_critics package"
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "navigation2"
ROS_BPN = "dwb_critics"

ROS_BUILD_DEPENDS = " \
    angles \
    costmap-queue \
    dwb-core \
    geometry-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav2-common \
    nav2-costmap-2d \
    nav2-util \
    pluginlib \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    costmap-queue \
    dwb-core \
    geometry-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav2-costmap-2d \
    nav2-util \
    pluginlib \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    costmap-queue \
    dwb-core \
    geometry-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav2-costmap-2d \
    nav2-util \
    pluginlib \
    rclcpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/navigation2-release/archive/release/jazzy/dwb_critics/1.3.7-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/dwb_critics"
SRC_URI = "git://github.com/SteveMacenski/navigation2-release;${ROS_BRANCH};protocol=https"
SRCREV = "4f2a8dff752b52798f472ca43716c5844cc22bfa"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
