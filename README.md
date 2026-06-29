[![Automatic version updates](https://github.com/ZOSOpenTools/coreutilsport/actions/workflows/bump.yml/badge.svg)](https://github.com/ZOSOpenTools/coreutilsport/actions/workflows/bump.yml)

# Coreutils

A collection of basic Unix utilities

# Installation and Usage

Use the zopen package manager ([QuickStart Guide](https://zopen.community/#/Guides/QuickStart)) to install:
```bash
zopen install coreutils
```

This z/OS port currently ships the following subset of GNU coreutils commands.
By default, the installed commands are available with a `g` prefix to avoid
collisions with z/OS `/bin` tools, for example `cp` as `gcp` and `ls` as `gls`.
This list mirrors the commands retained by the `ZOPEN_COREUTILS` allowlist in
`buildenv`.
```text
b2sum base32 base64 basename blake2 cat chcon chgrp chmod chown chroot chksum
comm cp csplit cut date dd dir dircolors dirname df du echo env expand expr
factor false fmt groups head id install join ls md5sum mkfifo mktemp mknod
nproc numfmt od pinky printf printenv ptx readlink realpath sha1sum sha224sum
sha256sum sha384sum sha512sum shasum stdbuf shred shuf sort stat sync sleep
touch tr tty vdir wc yes seq tac timeout truncate users
```

# Building from Source

1. Clone the repository:
```bash
git clone https://github.com/zopencommunity/coreutilsport.git
cd coreutilsport
```
2. Build using zopen:
```bash
zopen build -vv
```

See the [zopen porting guide](https://zopen.community/#/Guides/Porting) for more details.

# Documentation


# Troubleshooting
TBD

# Contributing
Contributions are welcome! Please follow the [zopen contribution guidelines](https://github.com/zopencommunity/meta/blob/main/CONTRIBUTING.md).
