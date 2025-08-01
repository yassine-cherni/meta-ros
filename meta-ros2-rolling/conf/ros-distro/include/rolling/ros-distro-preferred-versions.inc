# rolling/ros-distro-preferred-versions.inc
#
# Copyright (c) 2020 LG Electronics, Inc.

# Set PREFERRED_VERSION_<PN> here for non-platform packages for which the layers provide multiple versions and to override those
# set in ros-distro-platform-preferred-versions.inc .

# REP-0003 specifies 1.10.1 for noetic
# REP-2000 specifies 1.12.1 for humble and iron and 1.14.0 for jazzy
# This is necessary as with ROS1 many recipes fail to build
# as documented in https://github.com/ros/meta-ros/pull/936
# The head of the tree should be used for rolling
PREFERRED_VERSION_pcl = "1.14.1+git"

PREFERRED_VERSION_sdformat = "15.3.0"

# required for python3-scipy
PREFERRED_VERSION_python3-gast = "0.6.0"
