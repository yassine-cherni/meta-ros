# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "A python wrapper around hri package"
AUTHOR = "Luka Juricic <luka.juricic@pal-robotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "hri"
ROS_BPN = "pyhri"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    hri \
    opencv \
    pybind11-vendor \
    rclcpp \
    rclpy \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
    ament-cmake-python-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    hri \
    opencv \
    rclcpp \
    rclpy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    hri \
    opencv \
    rclcpp \
    rclpy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    cv-bridge \
    geometry-msgs \
    hri-msgs \
    opencv \
    python3-numpy \
    sensor-msgs \
    std-msgs \
    tf2-ros-py \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros4hri/libhri-release/archive/release/humble/pyhri/2.6.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/pyhri"
SRC_URI = "git://github.com/ros4hri/libhri-release;${ROS_BRANCH};protocol=https"
SRCREV = "2705e8f705e87f7eb5240e63fad5b6f3d47111cb"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
