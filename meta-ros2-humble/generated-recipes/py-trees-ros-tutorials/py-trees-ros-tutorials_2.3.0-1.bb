# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Tutorials for py_trees on ROS2."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier"
HOMEPAGE = "https://py-trees-ros-tutorials.readthedocs.io/en/release-2.0.x/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "py_trees_ros_tutorials"
ROS_BPN = "py_trees_ros_tutorials"

ROS_BUILD_DEPENDS = " \
    ${PYTHON_PN}-pyqt5 \
    python3-setuptools \
    qttools \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    action-msgs \
    geometry-msgs \
    launch \
    launch-ros \
    py-trees \
    py-trees-ros \
    py-trees-ros-interfaces \
    python3-pyqt5 \
    rcl-interfaces \
    rclpy \
    ros2launch \
    ros2param \
    ros2run \
    ros2service \
    ros2topic \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    action-msgs \
    py-trees \
    py-trees-ros \
    python3-pytest \
    rclpy \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/py_trees_ros_tutorials-release/archive/release/humble/py_trees_ros_tutorials/2.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/py_trees_ros_tutorials"
SRC_URI = "git://github.com/ros2-gbp/py_trees_ros_tutorials-release;${ROS_BRANCH};protocol=https"
SRCREV = "c086cba827c4a9fb7e86e9fa6facc25e619981d8"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
