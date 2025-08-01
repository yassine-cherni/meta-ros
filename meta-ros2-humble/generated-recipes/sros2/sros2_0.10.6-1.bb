# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Command line tools for managing SROS2 keys"
AUTHOR = "ROS Security Working Group <ros-security@googlegroups.com>"
ROS_AUTHOR = "Morgan Quigley <morgan@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "sros2"
ROS_BPN = "sros2"

ROS_BUILD_DEPENDS = " \
    rclpy \
    ros2cli \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    rclpy \
    ros2cli \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    python3 \
    python3-cryptography \
    python3-lxml \
    rclpy \
    ros2cli \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-mypy \
    ament-pep257 \
    python3-pytest \
    ros-testing \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/sros2-release/archive/release/humble/sros2/0.10.6-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/sros2"
SRC_URI = "git://github.com/ros2-gbp/sros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "5ba177efb367c0df10371d460a8aa01380a78f37"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
