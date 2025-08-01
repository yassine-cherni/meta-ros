# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "The rtcm_msgs package contains messages related to data in the RTCM format."
AUTHOR = "Marek Materzok <tilk@tilk.eu>"
ROS_AUTHOR = "Marek Materzok <tilk@tilk.eu>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rtcm_msgs"
ROS_BPN = "rtcm_msgs"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    ros-environment \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosidl-default-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rtcm_msgs-release/archive/release/rolling/rtcm_msgs/1.1.6-3.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rtcm_msgs"
SRC_URI = "git://github.com/ros2-gbp/rtcm_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "79254b5d483f7f53b6915dfb4c74340b3b81de42"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
