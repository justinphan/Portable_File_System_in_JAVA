package PFS;

// each data block contain the data of 256 bytes
public class DataBlock {
	//data
	byte[] fileData;
	//constructor
	public DataBlock(int size){
		fileData = new byte[size];
	}
	//set and get for fileData
	public byte[] getFileData() {
		return fileData;
	}
	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
}
