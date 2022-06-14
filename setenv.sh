#!/bin/sh
#
# Set up environment variables for general build tool to operate
#
if ! [ -f ./setenv.sh ]; then
  echo "Need to source from the setenv.sh directory" >&2
  return 0
fi

export PORT_ROOT="${PWD}"
export PORT_TYPE="TARBALL"
export PORT_TARBALL_URL="https://ftp.wayne.edu/gnu/coreutils/coreutils-9.1.tar.gz"
export PORT_TARBALL_DEPS="make"
export PORT_BOOTSTRAP="skip"
export PORT_EXTRA_CPPFLAGS="-DSLOW_BUT_NO_HACKS=1"
export PORT_EXTRA_CONFIGURE_OPTS="--disable-dependency-tracking"
