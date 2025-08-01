# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Controller for compensating for gravity on a group of joints"
AUTHOR = "Pyo <pyo@robotis.com>"
ROS_AUTHOR = "Woojin Wie <wwj@robotis.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "open_manipulator"
ROS_BPN = "om_gravity_compensation_controller"

ROS_BUILD_DEPENDS = " \
    angles \
    backward-ros \
    control-msgs \
    control-toolbox \
    controller-interface \
    generate-parameter-library \
    hardware-interface \
    kdl-parser \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    realtime-tools \
    rsl \
    tl-expected \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    backward-ros \
    control-msgs \
    control-toolbox \
    controller-interface \
    generate-parameter-library \
    hardware-interface \
    kdl-parser \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    realtime-tools \
    rsl \
    tl-expected \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    backward-ros \
    control-msgs \
    control-toolbox \
    controller-interface \
    generate-parameter-library \
    hardware-interface \
    kdl-parser \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    realtime-tools \
    rsl \
    tl-expected \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/open_manipulator-release/archive/release/rolling/om_gravity_compensation_controller/4.0.5-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/om_gravity_compensation_controller"
SRC_URI = "git://github.com/ros2-gbp/open_manipulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "8185fe4df156bc99b7d5f71615f03361f248ce8f"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
