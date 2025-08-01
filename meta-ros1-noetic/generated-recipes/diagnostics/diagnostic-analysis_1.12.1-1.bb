# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The diagnostic_analysis package can convert a log of diagnostics data     into a series of CSV files. Robot logs are recorded with rosbag, and     can be processed offline using the scripts in this package."
AUTHOR = "Guglielmo Gemignani <guglielmo.gemignani@gmail.com>"
ROS_AUTHOR = "Kevin Watts"
HOMEPAGE = "http://www.ros.org/wiki/diagnostics_analysis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "diagnostics"
ROS_BPN = "diagnostic_analysis"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    rosbag \
    roslib \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    rosbag \
    roslib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    rosbag \
    roslib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/diagnostics-release/archive/release/noetic/diagnostic_analysis/1.12.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/diagnostic_analysis"
SRC_URI = "git://github.com/ros-gbp/diagnostics-release;${ROS_BRANCH};protocol=https"
SRCREV = "c528114cd565f4f0fd7e65fb9c8212cdc12296a7"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
