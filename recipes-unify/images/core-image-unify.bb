#
# Copyright (C) 2016 Travelping GmbH
#
SUMMARY = "Image for UNIFY Universal Node"
LICENSE = "MIT"

PR = "r3"

inherit core-image-caros core-image distro_features_check extrausers

IMAGE_FEATURES += "splash ssh-server-openssh ${CAROS_IMAGE_FEATURES}"
IMAGE_INSTALL += "util-linux-setterm"
IMAGE_INSTALL += "parted btrfs-tools e2fsprogs-mke2fs e2fsprogs-resize2fs e2fsprogs-tune2fs"
IMAGE_INSTALL += "caros-core"
IMAGE_INSTALL += "tcpdump curl iperf iperf3 socat"
IMAGE_INSTALL += "autoisis erlang-unify-hostinfo autoisis-demo"

IMAGE_INSTALL += "carosadm"
IMAGE_INSTALL += "un-orchestrator uno-demo-config"
IMAGE_INSTALL += "virtualizer"
IMAGE_INSTALL += "balancer-nf"
IMAGE_INSTALL += "docker"

# having at least 4k blocks allows conversion from ext3 to btrfs
EXTRA_IMAGECMD_ext3 += "-b 4096"

# set root password to 'caros'
#
# compute new value with: perl -e 'print crypt("secret","\$6\$pHNG7CcLpB/\$") . "\n"'
# dollar ($) signs need backspace encoding
#
EXTRA_USERS_PARAMS = "usermod -p '\$6\$pHNG7CcLpB/\$Ema9IqIVLbBX.RbaYeVULVXPsq67amN5QEgjLF9zKWHtx2UhAgopVI.TcgP8WJw58G1LczqWlPIe.39/c2CNL.' root;"
