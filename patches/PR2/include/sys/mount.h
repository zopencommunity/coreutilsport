#ifndef _MOUNT_H
#define	_MOUNT_H

#define MNT_WAIT        1       /* synchronized I/O file integrity completion */
#define MNT_NOWAIT      2       /* start all I/O, but do not wait for it */
#define MNT_DWAIT       4       /* synchronized I/O data integrity completion */

/*
 * MSF Note the following is a general set of definitions with no backing code
 */
struct statfs {
        long    f_bsize;   
        long    f_blocks; 
        long    f_bfree; 
        short   f_type; 
        long    f_flags; 
        char    f_fstypename[16];
        char    f_mntonname[16];  
        char    f_mntfromname[16];
};

int getmntinfo(struct statfs **mntbufp, int flags) { return 0; }

#endif
