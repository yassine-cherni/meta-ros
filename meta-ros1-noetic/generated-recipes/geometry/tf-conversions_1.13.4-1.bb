# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This package contains a set of conversion functions to convert common tf datatypes (point, vector, pose, etc) into semantically identical datatypes used by other libraries. The conversion functions make it easier for users of the transform library (tf) to work with the datatype of their choice. Currently this package has support for the Kinematics and Dynamics Library (KDL) and the Eigen matrix library. This package is stable, and will get integrated into tf in the next major release cycle (see roadmap)."
AUTHOR = "Tully Foote <tfoote@osrfoundation.org>"
ROS_AUTHOR = "Tully Foote"
HOMEPAGE = "http://www.ros.org/wiki/tf_conversions"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "geometry"
ROS_BPN = "tf_conversions"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    kdl-conversions \
    libeigen \
    orocos-kdl \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    orocos-kdl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    kdl-conversions \
    libeigen \
    orocos-kdl \
    python3-pykdl \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/geometry-release/archive/release/noetic/tf_conversions/1.13.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/tf_conversions"
SRC_URI = "git://github.com/ros-gbp/geometry-release;${ROS_BRANCH};protocol=https"
SRCREV = "cecfb8b57630fcdc5826294f16b72dfb73c72eb2"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
