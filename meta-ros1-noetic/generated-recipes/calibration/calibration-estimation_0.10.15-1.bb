# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Runs an optimization to estimate the a robot's kinematic parameters. This package is a     generic rewrite of pr2_calibration_estimation."
AUTHOR = "David Feil-Seifer <david.feilseifer@gmail.com>"
ROS_AUTHOR = "Vijay Pradeep"
HOMEPAGE = "http://ros.org/wiki/calibration_estimation"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "calibration"
ROS_BPN = "calibration_estimation"

ROS_BUILD_DEPENDS = " \
    calibration-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    calibration-msgs \
    python3-matplotlib \
    python3-pykdl \
    python3-scipy \
    rospy \
    rostest \
    sensor-msgs \
    urdfdom-py \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/calibration-release/archive/release/noetic/calibration_estimation/0.10.15-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/calibration_estimation"
SRC_URI = "git://github.com/ros-gbp/calibration-release;${ROS_BRANCH};protocol=https"
SRCREV = "905bc1ff95a02deea0c21defa8cd0ca4eb7f8f21"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
