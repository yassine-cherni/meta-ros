# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Aerostack2 core package which contains the basic classes of the Aerostack2 framework"
AUTHOR = "CVAR-UPM <cvar.upm3@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "aerostack2"
ROS_BPN = "as2_core"

ROS_BUILD_DEPENDS = " \
    ament-cmake \
    as2-msgs \
    cv-bridge \
    geographic-msgs \
    geographiclib \
    geometry-msgs \
    image-transport \
    libeigen \
    nav-msgs \
    python3-pybind11 \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-cmake \
    as2-msgs \
    cv-bridge \
    geographic-msgs \
    geographiclib \
    geometry-msgs \
    image-transport \
    libeigen \
    nav-msgs \
    python3-pybind11 \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake \
    as2-msgs \
    cv-bridge \
    geographic-msgs \
    geographiclib \
    geometry-msgs \
    image-transport \
    libeigen \
    nav-msgs \
    python3-pybind11 \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/aerostack2-release/archive/release/humble/as2_core/1.1.2-2.tar.gz
ROS_BRANCH ?= "branch=release/humble/as2_core"
SRC_URI = "git://github.com/ros2-gbp/aerostack2-release;${ROS_BRANCH};protocol=https"
SRCREV = "df7c26a53f50f318429209e51eb1bf18ed63e31c"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
