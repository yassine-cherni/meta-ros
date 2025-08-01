# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Visualization plugin for several sensors."
AUTHOR = "Eloy Bricneo <eloy.briceno@ekumenlabs.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD Clause 3"
LICENSE = "BSD-Clause-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=e2197b8633fd51a47f897d9d6f820c24"

ROS_CN = "rqt_gauges"
ROS_BPN = "rqt_gauges"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    qt-gui \
    qt-gui-py-common \
    rclpy \
    rqt-gui \
    rqt-gui-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-flake8 \
    ament-xmllint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rqt_gauges-release/archive/release/rolling/rqt_gauges/0.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rqt_gauges"
SRC_URI = "git://github.com/ros2-gbp/rqt_gauges-release;${ROS_BRANCH};protocol=https"
SRCREV = "4a0554e45ca3d3a92a83d66e4695ba18363d358a"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
