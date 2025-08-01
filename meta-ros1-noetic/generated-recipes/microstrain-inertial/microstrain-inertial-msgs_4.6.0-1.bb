# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "A package that contains ROS message corresponding to microstrain message types."
AUTHOR = "Rob Fisher <rob.fisher@parker.com>"
ROS_AUTHOR = "Dr. Kristopher Krasnosky"
HOMEPAGE = "https://github.com/LORD-MicroStrain/microstrain_inertial"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "microstrain_inertial"
ROS_BPN = "microstrain_inertial_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
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

# matches with: https://github.com/LORD-MicroStrain/microstrain_inertial-release/archive/release/noetic/microstrain_inertial_msgs/4.6.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/microstrain_inertial_msgs"
SRC_URI = "git://github.com/LORD-MicroStrain/microstrain_inertial-release;${ROS_BRANCH};protocol=https"
SRCREV = "1ad404a2891ed6ef14967712e032c16acb62aee1"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
