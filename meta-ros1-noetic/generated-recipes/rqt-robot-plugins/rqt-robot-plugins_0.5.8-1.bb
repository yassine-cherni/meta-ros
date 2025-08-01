# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Metapackage of rqt plugins that are particularly used with robots    during its operation.<br/>    <br/>    To run any rqt plugins, just type in a single command &quot;rqt&quot;, then select any plugins you want from the GUI that launches afterwards.<br/>    <br/>    rqt consists of three following metapackages:<br/>     <ul>      <li><a href="http://ros.org/wiki/rqt">rqt</a> - provides a container window          where all rqt tools can be docked at. rqt plugin developers barely          needs to pay attention.</li>      <li><a href="http://ros.org/wiki/rqt_common_plugins">rqt_common_plugins</a> -          ROS backend tools suite that can be used on/off of robot runtime.</li>      <li>rqt_robot_plugins (You're here!)</li>     </ul>"
AUTHOR = "Aaron Blasdel <ablasdel@gmail.com>"
ROS_AUTHOR = "Dirk Thomas"
HOMEPAGE = "http://ros.org/wiki/rqt_robot_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_robot_plugins"
ROS_BPN = "rqt_robot_plugins"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rqt-moveit \
    rqt-nav-view \
    rqt-pose-view \
    rqt-robot-dashboard \
    rqt-robot-monitor \
    rqt-robot-steering \
    rqt-runtime-monitor \
    rqt-rviz \
    rqt-tf-tree \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rqt-moveit \
    rqt-nav-view \
    rqt-pose-view \
    rqt-robot-dashboard \
    rqt-robot-monitor \
    rqt-robot-steering \
    rqt-runtime-monitor \
    rqt-rviz \
    rqt-tf-tree \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/rqt_robot_plugins-release/archive/release/noetic/rqt_robot_plugins/0.5.8-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rqt_robot_plugins"
SRC_URI = "git://github.com/ros-gbp/rqt_robot_plugins-release;${ROS_BRANCH};protocol=https"
SRCREV = "19a98ae9037043c0e0b93c7b3d041af46809ff15"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
