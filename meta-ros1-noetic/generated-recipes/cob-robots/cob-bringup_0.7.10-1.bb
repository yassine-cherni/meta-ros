# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This package provides launch files for operating Care-O-bot."
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
ROS_AUTHOR = "Felix Messmer <fxm@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/cob_bringup"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_robots"
ROS_BPN = "cob_bringup"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    canopen-chain-node \
    canopen-motor-node \
    cob-android-script-server \
    cob-base-controller-utils \
    cob-base-velocity-smoother \
    cob-bms-driver \
    cob-calibration-data \
    cob-cam3d-throttle \
    cob-collision-monitor \
    cob-collision-velocity-filter \
    cob-command-gui \
    cob-control-mode-adapter \
    cob-dashboard \
    cob-default-env-config \
    cob-default-robot-behavior \
    cob-default-robot-config \
    cob-docker-control \
    cob-frame-tracker \
    cob-hand-bridge \
    cob-hardware-config \
    cob-helper-tools \
    cob-image-flip \
    cob-light \
    cob-linear-nav \
    cob-mecanum-controller \
    cob-mimic \
    cob-monitoring \
    cob-moveit-config \
    cob-obstacle-distance \
    cob-omni-drive-controller \
    cob-phidget-em-state \
    cob-phidget-power-state \
    cob-phidgets \
    cob-reflector-referencing \
    cob-safety-controller \
    cob-scan-unifier \
    cob-script-server \
    cob-sick-lms1xx \
    cob-sick-s300 \
    cob-sound \
    cob-teleop \
    cob-twist-controller \
    cob-voltage-control \
    compressed-depth-image-transport \
    compressed-image-transport \
    controller-manager \
    costmap-2d \
    diagnostic-aggregator \
    generic-throttle \
    image-proc \
    joint-state-controller \
    joint-state-publisher \
    joint-trajectory-controller \
    joy \
    laser-filters \
    nodelet \
    openni2-launch \
    position-controllers \
    realsense2-camera \
    rgbd-launch \
    robot-state-publisher \
    rosserial-python \
    rosserial-server \
    rostopic \
    rviz \
    spacenav-node \
    tf2-ros \
    theora-image-transport \
    topic-tools \
    twist-mux \
    usb-cam \
    velocity-controllers \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    cob-supported-robots \
    roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_robots-release/archive/release/noetic/cob_bringup/0.7.10-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/cob_bringup"
SRC_URI = "git://github.com/ipa320/cob_robots-release;${ROS_BRANCH};protocol=https"
SRCREV = "d93ab0055bc6b02ce4bb3926468df524673cfcf7"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
