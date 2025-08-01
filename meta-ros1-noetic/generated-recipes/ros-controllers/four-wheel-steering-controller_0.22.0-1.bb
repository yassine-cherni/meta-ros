# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Controller for a four wheel steering mobile base."
AUTHOR = "Vincent Rousseau <vincent.rousseau@irstea.fr>"
ROS_AUTHOR = "Vincent Rousseau <vincent.rousseau@irstea.fr>"
HOMEPAGE = "http://ros.org/wiki/four_wheel_steering_controller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_controllers"
ROS_BPN = "four_wheel_steering_controller"

ROS_BUILD_DEPENDS = " \
    boost \
    controller-interface \
    four-wheel-steering-msgs \
    hardware-interface \
    nav-msgs \
    pluginlib \
    realtime-tools \
    roscpp \
    tf \
    urdf-geometry-parser \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    controller-interface \
    four-wheel-steering-msgs \
    hardware-interface \
    nav-msgs \
    realtime-tools \
    roscpp \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-interface \
    realtime-tools \
    roscpp \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    controller-manager \
    geometry-msgs \
    rosgraph-msgs \
    rostest \
    std-msgs \
    std-srvs \
    xacro \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_controllers-release/archive/release/noetic/four_wheel_steering_controller/0.22.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/four_wheel_steering_controller"
SRC_URI = "git://github.com/ros-gbp/ros_controllers-release;${ROS_BRANCH};protocol=https"
SRCREV = "9183320afb2dc0d32d2ed13d120e78ab4388714c"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
