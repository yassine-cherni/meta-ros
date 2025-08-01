# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "A lightweight multivehicle simulation framework."
AUTHOR = "Jose-Luis Blanco-Claraco <jlblanco@ual.es>"
HOMEPAGE = "https://wiki.ros.org/mvsim"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mvsim"
ROS_BPN = "mvsim"

ROS_BUILD_DEPENDS = " \
    ament-cmake-xmllint \
    boost \
    mrpt-libgui \
    mrpt-libmaps \
    mrpt-libposes \
    mrpt-libros-bridge \
    mrpt-libtclap \
    nav-msgs \
    protobuf \
    python3 \
    python3-pip \
    python3-protobuf \
    python3-pybind11 \
    ros-environment \
    sensor-msgs \
    stereo-msgs \
    tf2 \
    tf2-geometry-msgs \
    unzip \
    visualization-msgs \
    wget \
    zeromq \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-gmock-native \
    ament-cmake-gtest-native \
    ament-cmake-native \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    mrpt-libgui \
    mrpt-libmaps \
    mrpt-libposes \
    mrpt-libros-bridge \
    mrpt-libtclap \
    nav-msgs \
    protobuf \
    python3 \
    python3-pip \
    python3-protobuf \
    python3-pybind11 \
    sensor-msgs \
    stereo-msgs \
    tf2 \
    tf2-geometry-msgs \
    unzip \
    visualization-msgs \
    wget \
    zeromq \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    mrpt-libgui \
    mrpt-libmaps \
    mrpt-libposes \
    mrpt-libros-bridge \
    mrpt-libtclap \
    nav-msgs \
    protobuf \
    python3 \
    python3-pip \
    python3-protobuf \
    python3-pybind11 \
    ros2launch \
    sensor-msgs \
    stereo-msgs \
    tf2 \
    tf2-geometry-msgs \
    unzip \
    visualization-msgs \
    wget \
    zeromq \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mvsim-release/archive/release/rolling/mvsim/0.14.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/mvsim"
SRC_URI = "git://github.com/ros2-gbp/mvsim-release;${ROS_BRANCH};protocol=https"
SRCREV = "2d6e3015b3399f2bb5563d56081877fa6f1f0bf2"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
