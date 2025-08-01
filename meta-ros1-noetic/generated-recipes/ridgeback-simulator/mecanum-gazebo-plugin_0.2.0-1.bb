# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Plugin which uses directional friction to simulate mecanum wheels."
AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
ROS_AUTHOR = "Mike Purvis"
HOMEPAGE = "http://wiki.ros.org/mecanum_gazebo_plugin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ridgeback_simulator"
ROS_BPN = "mecanum_gazebo_plugin"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gazebo} \
    rosconsole \
    roslint \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gazebo} \
    rosconsole \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gazebo} \
    rosconsole \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/ridgeback_simulator-release/archive/release/noetic/mecanum_gazebo_plugin/0.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/mecanum_gazebo_plugin"
SRC_URI = "git://github.com/clearpath-gbp/ridgeback_simulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "bf54daf1f59f9757bf6bf93a5c4e18593440eadc"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
