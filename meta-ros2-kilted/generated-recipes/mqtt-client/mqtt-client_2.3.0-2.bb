# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_kilted
inherit ros_superflore_generated

DESCRIPTION = "Node that enables connected ROS-based devices or robots to exchange ROS messages via an MQTT broker using the MQTT protocol."
AUTHOR = "Lennart Reiher <lennart.reiher@rwth-aachen.de>"
ROS_AUTHOR = "Lennart Reiher <lennart.reiher@rwth-aachen.de>"
HOMEPAGE = "http://wiki.ros.org/mqtt_client"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "mqtt_client"
ROS_BPN = "mqtt_client"

ROS_BUILD_DEPENDS = " \
    fmt \
    mqtt-client-interfaces \
    paho-mqtt-c \
    paho-mqtt-cpp \
    rclcpp \
    rclcpp-components \
    rcpputils \
    ros-environment \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    fmt \
    mqtt-client-interfaces \
    paho-mqtt-c \
    paho-mqtt-cpp \
    rclcpp \
    rclcpp-components \
    rcpputils \
    ros-environment \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fmt \
    mqtt-client-interfaces \
    paho-mqtt-c \
    paho-mqtt-cpp \
    rclcpp \
    rclcpp-components \
    rcpputils \
    ros-environment \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mqtt_client-release/archive/release/kilted/mqtt_client/2.3.0-2.tar.gz
ROS_BRANCH ?= "branch=release/kilted/mqtt_client"
SRC_URI = "git://github.com/ros2-gbp/mqtt_client-release;${ROS_BRANCH};protocol=https"
SRCREV = "3773381e48a4d921f959b09b96e2b51a5a756899"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
