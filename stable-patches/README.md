# Patch Description

## Categorization of Patches

### Missing Function on z/OS

Several of the files have to be patched because the S_TYPEISSEM, S_TYPEISMQ, S_TYPE_ISSHM, S_TYPEISTMO
macros are not defined on z/OS. 

The posix_memalign function does not exist on z/OS, so posix_memalign.c has to be changed to a malloc in
posix_memalign.c

pinky.c has to work around a lack of support for commas in the password structure

timeout.c has to work around lack of timer_settime() with nanosecond resolution

### Differences on z/OS

To eliminate annoying warning messages, `build-aux/test-driver` has a patch to properly encode
the signal SIGPIPE instead of hardcoding 13. This has been upstreamed awhile back but hasn't
been propagaged to this package.

### ASCII / EBCDIC issues

fdopendir_with_dup does not close the file descriptor, which seems a bug, but has not yet 
been accepted. It causes problems on z/OS.

basenc.c has to disable auto-conversion.
copy.c has to copy file tags across files.
digest.c needs to work in binary mode regardless of the O_BINARY flag
od.c needs to have autoconversion disabled since files should be processed in binary


### Compatibility with z/OS provided commands

Many of the commands in coreutils are also part of z/OS. In some cases, the capability in coreutils
is a proper superset of the z/OS function, and there is no migration issue.
In other cases, z/OS has special support added for z/OS specific capabilities, most notably datasets.

cp.c has been patched so that if a file in the list of files to process starts with '//', then the 
underlying z/OS `/bin/cp` command will be called.

The intent is to patch other commands that are analagous, such as `cat`. 

### Possible bugs in base code



The following patches are required:

```
./build-aux/test-driver.patch
./lib/fdopendir.c.patch
./lib/posix_memalign.c.patch
./lib/filemode.c.patch
./src/copy.c.patch
./src/cp.c.patch
./src/pinky.c.patch
./src/basenc.c.patch
./src/digest.c.patch
./src/od.c.patch
./src/stat.c.patch
./src/timeout.c.patch
./src/dd.c.patch
./src/shred.c.patch
./src/sort.c.patch
./src/split.c.patch
./src/system.h.patch
```