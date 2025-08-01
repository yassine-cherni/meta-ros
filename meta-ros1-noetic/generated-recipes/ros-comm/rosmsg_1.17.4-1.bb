# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "rosmsg contains two command-line tools: <tt>rosmsg</tt> and     <tt>rossrv</tt>. <tt>rosmsg</tt> is a command-line tool for     displaying information about <a href="http://wiki.ros.org/msg">ROS Message     types</a>. <tt>rossrv</tt> is a command-line tool for displaying     information about <a href="http://wiki.ros.org/srv">ROS     Service types</a>."
AUTHOR = "Michael Carroll <michael@openrobotics.org>"
ROS_AUTHOR = "Ken Conley"
HOMEPAGE = "http://wiki.ros.org/rosmsg"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_comm"
ROS_BPN = "rosmsg"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    genmsg \
    genpy \
    python3-rospkg \
    rosbag \
    roslib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    diagnostic-msgs \
    rostest \
    std-msgs \
    std-srvs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_comm-release/archive/release/noetic/rosmsg/1.17.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rosmsg"
SRC_URI = "git://github.com/ros-gbp/ros_comm-release;${ROS_BRANCH};protocol=https"
SRCREV = "dff9e7cae1d477c42c2004d198f648d644c4c41f"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
