# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The pal_statistics package"
AUTHOR = "victor <victor.lopez@pal-robotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "pal_statistics"
ROS_BPN = "pal_statistics"

ROS_BUILD_DEPENDS = " \
    boost \
    pal-statistics-msgs \
    rosbag \
    roscpp \
    rospy \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    pal-statistics-msgs \
    rosbag \
    roscpp \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    pal-statistics-msgs \
    python3-future \
    rosbag \
    roscpp \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pal-gbp/pal_statistics-release/archive/release/noetic/pal_statistics/1.5.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/pal_statistics"
SRC_URI = "git://github.com/pal-gbp/pal_statistics-release;${ROS_BRANCH};protocol=https"
SRCREV = "bf44423fa0b9e23e443e472ebf1b9d990069ecd0"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
