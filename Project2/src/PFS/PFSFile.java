package PFS;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class PFSFile {
    private final RandomAccessFile rndmAccess;
    public String bitvector;
    public String fileListBitVector;
    byte[] capacity;
    public int blockStartingIndex;
    public int freeBlocks;  
    public int fileCount;
    


    FileControlBlock[] blocks;

    //initialization
	public PFSFile(String filename) throws IOException {
		// TODO Auto-generated constructor stub\
        rndmAccess = new RandomAccessFile(filename, "rw");
        
        
        //initialize pfs file info
        capacity = " ".getBytes();
        int i = 0;
        
       //the number of disk block is 30
        blocks = new FileControlBlock[32];
        while (i < 30) {
            blocks[i] = new FileControlBlock();
            i++;
        }
        //initialize the file info
        if (rndmAccess.length()==0) {
        	rndmAccess.seek(10240-1);
        	rndmAccess.write(capacity);
        	blockStartingIndex = 0;
        	freeBlocks = 30;
        	bitvector = "000000000000000000000000000000" ;
        	fileListBitVector =  "000000000000000000000000000000";
        	fileCount = 30;
        }	
	}
}
