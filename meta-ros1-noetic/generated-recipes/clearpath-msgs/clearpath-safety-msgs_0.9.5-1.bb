# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "ROS package containing the message definitions for the Clearpath Robotics OutdoorNav safety module."
AUTHOR = "José Mastrangelo <jmastrangelo@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=1fcc2f243daac9b962ca04b90988c4f3"

ROS_CN = "clearpath_msgs"
ROS_BPN = "clearpath_safety_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-generation \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-generation \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/clearpath_msgs-release/archive/release/noetic/clearpath_safety_msgs/0.9.5-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/clearpath_safety_msgs"
SRC_URI = "git://github.com/clearpath-gbp/clearpath_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "1b6670cfbfe997262a483859ae488da288092f67"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
