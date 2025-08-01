# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "The rt_usb_9axisimu_driver package"
AUTHOR = "RT Corporation <shop@rt-net.jp>"
ROS_AUTHOR = "RT Corporation <shop@rt-net.jp>"
HOMEPAGE = "https://github.com/rt-net/rt_usb_9axisimu_driver/issues"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rt_usb_9axisimu_driver"
ROS_BPN = "rt_usb_9axisimu_driver"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rt_usb_9axisimu_driver-release/archive/release/jazzy/rt_usb_9axisimu_driver/3.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/rt_usb_9axisimu_driver"
SRC_URI = "git://github.com/ros2-gbp/rt_usb_9axisimu_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "7088fe57dcc85827d8bd19fbb0d847f0b72e53d0"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
