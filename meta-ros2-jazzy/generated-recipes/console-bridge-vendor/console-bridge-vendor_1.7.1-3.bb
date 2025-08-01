# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Wrapper around console_bridge, providing nothing but a dependency on console_bridge, on some systems.     On others, it provides an ExternalProject build of console_bridge."
AUTHOR = "Scott K Logan <scott@openrobotics.org>"
ROS_AUTHOR = "Alejandro Hernandez Cordero <alejandro@openrobotics.org>"
HOMEPAGE = "https://github.com/ros/console_bridge"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0 & BSD"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_CN = "console_bridge_vendor"
ROS_BPN = "console_bridge_vendor"

ROS_BUILD_DEPENDS = " \
    console-bridge \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-vendor-package-native \
"

ROS_EXPORT_DEPENDS = " \
    console-bridge \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    console-bridge \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
    performance-test-fixture \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/console_bridge_vendor-release/archive/release/jazzy/console_bridge_vendor/1.7.1-3.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/console_bridge_vendor"
SRC_URI = "git://github.com/ros2-gbp/console_bridge_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "bb994f26fbd204276c099c630b9ee07e48e70026"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
