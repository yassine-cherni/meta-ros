# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Generate the type support for C++ messages."
AUTHOR = "Anthony Welte <tony.welte@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosidlcpp"
ROS_BPN = "rosidlcpp_typesupport_cpp"

ROS_BUILD_DEPENDS = " \
    fmt \
    nlohmann-json \
    rcpputils \
    rcutils \
    rosidl-runtime-c \
    rosidl-typesupport-c \
    rosidl-typesupport-introspection-cpp \
    rosidlcpp-generator-core \
    rosidlcpp-parser \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-core-native \
"

ROS_EXPORT_DEPENDS = " \
    fmt \
    nlohmann-json \
    rcpputils \
    rcutils \
    rosidl-runtime-c \
    rosidl-runtime-cpp \
    rosidl-typesupport-c \
    rosidlcpp-generator-core \
    rosidlcpp-parser \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-core-native \
"

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    fmt \
    nlohmann-json \
    rcpputils \
    rcutils \
    rosidl-cli \
    rosidl-generator-c \
    rosidl-generator-type-description \
    rosidl-pycommon \
    rosidl-typesupport-interface \
    rosidlcpp-generator-core \
    rosidlcpp-parser \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosidlcpp-release/archive/release/rolling/rosidlcpp_typesupport_cpp/0.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rosidlcpp_typesupport_cpp"
SRC_URI = "git://github.com/ros2-gbp/rosidlcpp-release;${ROS_BRANCH};protocol=https"
SRCREV = "2406f7cd8cd27032e6a2fb1ecf21afda58c5d205"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
