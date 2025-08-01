# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "<p>       ROS-Industrial support for the ABB IRB 2400 (and variants).     </p>     <p>       This package contains configuration data, 3D models and launch files       for ABB IRB 2400 manipulators. This currently includes the base model.     </p>     <p>       Joint limits and max joint velocities are based on the information in       the ABB data sheets.  All URDFs / XACROs are based on the       default motion and joint velocity limits, unless noted otherwise (ie:       no support for high speed joints, extended / limited motion ranges or       other options).     </p>     <p>       Before using any of the configuration files and / or meshes included       in this package, be sure to check they are correct for the particular       robot model and configuration you intend to use them with.     </p>     <p>       The unqualified IRB 2400 model will be removed in ROS-Lunar, please       use the IRB 2400-12/1.55 as a replacement.     </p>"
AUTHOR = "ROS-Industrial community <noreply@rosindustrial.org>"
ROS_AUTHOR = "Dan Solomon (SwRI)"
HOMEPAGE = "http://ros.org/wiki/abb_irb2400_support"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=34;endline=34;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "abb"
ROS_BPN = "abb_irb2400_support"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    abb-driver \
    abb-resources \
    industrial-robot-client \
    joint-state-publisher-gui \
    robot-state-publisher \
    rviz \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-industrial-release/abb-release/archive/release/noetic/abb_irb2400_support/1.5.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/abb_irb2400_support"
SRC_URI = "git://github.com/ros-industrial-release/abb-release;${ROS_BRANCH};protocol=https"
SRCREV = "9a2cb49ccdecfb1cf8da32914fe815420fdd9702"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
