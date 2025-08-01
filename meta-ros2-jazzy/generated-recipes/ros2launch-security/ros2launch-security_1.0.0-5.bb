# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Security extensions for ros2 launch"
AUTHOR = "Ted Kern <ted.kern@canonical.com>"
ROS_AUTHOR = "Geoffrey Biggs <geoff@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ros2launch_security"
ROS_BPN = "ros2launch_security"

ROS_BUILD_DEPENDS = " \
    ament-index-python \
    nodl-python \
    ros2launch \
    sros2 \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    ament-index-python \
    nodl-python \
    ros2launch \
    sros2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    nodl-python \
    ros2launch \
    sros2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    demo-nodes-py \
    launch-ros \
    python3-pytest \
    ros2launch \
    sros2 \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros2launch_security-release/archive/release/jazzy/ros2launch_security/1.0.0-5.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/ros2launch_security"
SRC_URI = "git://github.com/ros2-gbp/ros2launch_security-release;${ROS_BRANCH};protocol=https"
SRCREV = "e896c13bfc8f93f259902eec99483b65336b2458"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
