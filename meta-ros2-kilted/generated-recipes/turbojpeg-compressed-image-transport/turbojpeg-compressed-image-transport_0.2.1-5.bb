# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_kilted
inherit ros_superflore_generated

DESCRIPTION = "Compressed_image_transport provides a plugin to image_transport for transparently sending images     encoded as JPEG by turbojpeg."
AUTHOR = "Daisuke Nishiamtsu <border_goldenmarket@yahoo.co.jp>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0 & BSD"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "turbojpeg_compressed_image_transport"
ROS_BPN = "turbojpeg_compressed_image_transport"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    image-transport \
    libjpeg-turbo \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    image-transport \
    libjpeg-turbo \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    image-transport \
    libjpeg-turbo \
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

# matches with: https://github.com/ros2-gbp/turbojpeg_compressed_image_transport-release/archive/release/kilted/turbojpeg_compressed_image_transport/0.2.1-5.tar.gz
ROS_BRANCH ?= "branch=release/kilted/turbojpeg_compressed_image_transport"
SRC_URI = "git://github.com/ros2-gbp/turbojpeg_compressed_image_transport-release;${ROS_BRANCH};protocol=https"
SRCREV = "37b03937b8cd65fba5071df56e3ff37c21881cd1"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
