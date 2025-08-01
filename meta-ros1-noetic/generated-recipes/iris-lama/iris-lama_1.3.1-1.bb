# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "IRIS package for Localization and Mapping (LaMa).         This packages includes the sparse-dense library for grid mapping,         a 2D localization algorithm based on scan matching, an online SLAM solution         with a dynamic likelihood field and a 2D RB Particle Filter SLAM solution         with multithreading."
AUTHOR = "Eurico Pedrosa <efp@ua.pt>"
ROS_AUTHOR = "Eurico Pedrosa <efp@ua.pt>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "iris_lama"
ROS_BPN = "iris_lama"

ROS_BUILD_DEPENDS = " \
    libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/eupedrosa/iris_lama-release/archive/release/noetic/iris_lama/1.3.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/iris_lama"
SRC_URI = "git://github.com/eupedrosa/iris_lama-release;${ROS_BRANCH};protocol=https"
SRCREV = "a9aa58bf68e190d4fb2e5969eece00ea4b711261"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
