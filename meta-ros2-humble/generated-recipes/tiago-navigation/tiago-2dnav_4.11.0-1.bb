# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "TIAGo-specific launch files needed to run navigation on a TIAGo robot."
AUTHOR = "Jordan Palacios <jordan.palacios@pal-robotics.com>"
ROS_AUTHOR = "Enrique Fernandez <enrique.fernandez@pal-robotics.com>"
HOMEPAGE = "https://github.com/pal-robotics/tiago_simulation"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "tiago_navigation"
ROS_BPN = "tiago_2dnav"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    omni-base-2dnav \
    pmb2-2dnav \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pal-gbp/tiago_navigation-release/archive/release/humble/tiago_2dnav/4.11.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/tiago_2dnav"
SRC_URI = "git://github.com/pal-gbp/tiago_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "034bfa18839f8b3141213ebfc9ba7ee4533caeea"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
