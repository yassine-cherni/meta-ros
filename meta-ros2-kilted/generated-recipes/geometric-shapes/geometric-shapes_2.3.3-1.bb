# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_kilted
inherit ros_superflore_generated

DESCRIPTION = "This package contains generic definitions of geometric shapes and bodies."
AUTHOR = "Tyler Weaver <tyler@picknik.ai>"
ROS_AUTHOR = "Ioan Sucan <isucan@google.com>"
HOMEPAGE = "http://ros.org/wiki/geometric_shapes"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "geometric_shapes"
ROS_BPN = "geometric_shapes"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-liboctomap-dev} \
    assimp \
    boost \
    console-bridge-vendor \
    eigen-stl-containers \
    fcl \
    geometry-msgs \
    libeigen \
    pkgconfig \
    qhull \
    random-numbers \
    rclcpp \
    resource-retriever \
    shape-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    eigen3-cmake-module-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-liboctomap-dev} \
    boost \
    console-bridge-vendor \
    eigen-stl-containers \
    geometry-msgs \
    libeigen \
    random-numbers \
    rclcpp \
    resource-retriever \
    shape-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    eigen3-cmake-module-native \
"

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-liboctomap-dev} \
    assimp \
    boost \
    console-bridge-vendor \
    eigen-stl-containers \
    fcl \
    geometry-msgs \
    qhull \
    random-numbers \
    rclcpp \
    resource-retriever \
    rosidl-default-runtime \
    shape-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-copyright \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/geometric_shapes-release/archive/release/kilted/geometric_shapes/2.3.3-1.tar.gz
ROS_BRANCH ?= "branch=release/kilted/geometric_shapes"
SRC_URI = "git://github.com/ros2-gbp/geometric_shapes-release;${ROS_BRANCH};protocol=https"
SRCREV = "4751793995e05cd2236cf307c971525e99e06f94"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
