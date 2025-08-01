# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS driver for fadecandy LED controllers"
AUTHOR = "Rein Appeldoorn <reinzor@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "fadecandy_ros"
ROS_BPN = "fadecandy_driver"

ROS_BUILD_DEPENDS = " \
    diagnostic-updater \
    fadecandy-msgs \
    libusb1 \
    pkgconfig \
    rclcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-updater \
    fadecandy-msgs \
    libusb1 \
    rclcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-updater \
    fadecandy-msgs \
    libusb1 \
    rclcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rclpy \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/eurogroep/fadecandy_ros-release/archive/release/humble/fadecandy_driver/1.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/fadecandy_driver"
SRC_URI = "git://github.com/eurogroep/fadecandy_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "181ceb15e2948bd0a7161601e81ca79ee40fd44f"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
