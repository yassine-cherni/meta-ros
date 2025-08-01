# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "3-dof configuration space planner for mobile robot"
AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
ROS_AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "neonavigation"
ROS_BPN = "planner_cspace"

ROS_BUILD_DEPENDS = " \
    actionlib \
    costmap-cspace \
    costmap-cspace-msgs \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    move-base-msgs \
    nav-msgs \
    neonavigation-common \
    neonavigation-metrics-msgs \
    planner-cspace-msgs \
    roscpp \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    trajectory-msgs \
    trajectory-tracker \
    trajectory-tracker-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    costmap-cspace \
    costmap-cspace-msgs \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    move-base-msgs \
    nav-msgs \
    neonavigation-common \
    neonavigation-metrics-msgs \
    planner-cspace-msgs \
    roscpp \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    trajectory-msgs \
    trajectory-tracker \
    trajectory-tracker-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    costmap-cspace \
    costmap-cspace-msgs \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    move-base-msgs \
    nav-msgs \
    neonavigation-common \
    neonavigation-metrics-msgs \
    planner-cspace-msgs \
    roscpp \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    trajectory-msgs \
    trajectory-tracker \
    trajectory-tracker-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    map-server \
    roslint \
    rostest \
    trajectory-tracker \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/at-wat/neonavigation-release/archive/release/noetic/planner_cspace/0.18.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/planner_cspace"
SRC_URI = "git://github.com/at-wat/neonavigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "dc6976f41ff00f3758bd46b4d776436448ea5392"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
