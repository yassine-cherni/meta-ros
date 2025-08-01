# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This package contains several rviz plugins to visualize HRI-related topics (like face/body region of interests, 3D skeletons...)"
AUTHOR = "Séverin Lemaignan <severin.lemaignan@pal-robotics.com>"
ROS_AUTHOR = "Lorenzo Ferrini"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "hri_rviz"
ROS_BPN = "hri_rviz"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    hri \
    hri-msgs \
    qtbase \
    roscpp \
    rviz \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    hri \
    hri-msgs \
    roscpp \
    rviz \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    hri \
    hri-msgs \
    qtbase \
    roscpp \
    rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros4hri/hri_rviz-release/archive/release/noetic/hri_rviz/0.4.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/hri_rviz"
SRC_URI = "git://github.com/ros4hri/hri_rviz-release;${ROS_BRANCH};protocol=https"
SRCREV = "5a3c7130fff693d09e71b722e78cdc4c98e23e1f"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
