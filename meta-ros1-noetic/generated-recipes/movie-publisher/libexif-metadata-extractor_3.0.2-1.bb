# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Metadata extractor utilizing libexif."
AUTHOR = "Martin Pecka <peckama2@fel.cvut.cz>"
ROS_AUTHOR = "Martin Pecka <peckama2@fel.cvut.cz>"
HOMEPAGE = "https://wiki.ros.org/libexif_metadata_extractor"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=c1feec27682903a4270dbb401e443f91"

ROS_CN = "movie_publisher"
ROS_BPN = "libexif_metadata_extractor"

ROS_BUILD_DEPENDS = " \
    cras-cpp-common \
    libexif \
    movie-publisher \
    pluginlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cras-cpp-common \
    libexif \
    movie-publisher \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    python3-catkin-lint \
    roslint \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/peci1/movie_publisher-release/archive/release/noetic/libexif_metadata_extractor/3.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/libexif_metadata_extractor"
SRC_URI = "git://github.com/peci1/movie_publisher-release;${ROS_BRANCH};protocol=https"
SRCREV = "fbb57869529b720a2219b50a7b504768fc5fc7d5"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
