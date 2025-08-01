# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "A trajectory cache for MoveIt 2 motion plans and cartesian plans."
AUTHOR = "Brandon Ong <methylDragon@intrinsic.ai>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "moveit"
ROS_BPN = "moveit_ros_trajectory_cache"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    moveit-common \
    moveit-ros-planning-interface \
    rclcpp \
    rclcpp-action \
    tf2-ros \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    moveit-common \
    moveit-ros-planning-interface \
    rclcpp \
    rclcpp-action \
    tf2-ros \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    moveit-common \
    moveit-ros \
    moveit-ros-planning-interface \
    python3-pyyaml \
    rclcpp \
    rclcpp-action \
    tf2-ros \
    trajectory-msgs \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-cmake-uncrustify \
    launch-pytest \
    launch-testing-ament-cmake \
    moveit-configs-utils \
    moveit-planners-ompl \
    moveit-resources \
    python3-pytest \
    rmf-utils \
    robot-state-publisher \
    ros2-control \
    warehouse-ros-sqlite \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/moveit2-release/archive/release/rolling/moveit_ros_trajectory_cache/2.14.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/moveit_ros_trajectory_cache"
SRC_URI = "git://github.com/ros2-gbp/moveit2-release;${ROS_BRANCH};protocol=https"
SRCREV = "53d0bfc228c5edc097d4f3ec362a53caf587f974"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
