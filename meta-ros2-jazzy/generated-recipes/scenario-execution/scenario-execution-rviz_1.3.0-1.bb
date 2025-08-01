# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "The scenario_execution_rviz package"
AUTHOR = "Frederik Pasch <fred-labs@mailbox.org>"
ROS_AUTHOR = "Intel Labs"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "scenario_execution"
ROS_BPN = "scenario_execution_rviz"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    py-trees-ros-interfaces \
    qtbase \
    rclcpp \
    rviz-common \
    scenario-execution-interfaces \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
    rviz-common \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    py-trees-ros-interfaces \
    qtbase \
    rclcpp \
    rviz-common \
    scenario-execution-interfaces \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/scenario_execution-release/archive/release/jazzy/scenario_execution_rviz/1.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/scenario_execution_rviz"
SRC_URI = "git://github.com/ros2-gbp/scenario_execution-release;${ROS_BRANCH};protocol=https"
SRCREV = "babaab8af1dd27c2cdc25cce9be192fba7daf9a7"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
