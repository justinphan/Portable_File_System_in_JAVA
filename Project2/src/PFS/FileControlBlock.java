package PFS;

public class FileControlBlock {
    
	public static final int fileNameMaxSize = 20;
    public static final int dataMaxSize = 24;
	
	private String Name;
    private int Size;
    private String Date;
    private String Time;
    private int startingID;
    private int endingID;
    
    
    public FileControlBlock() {
	}
    
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public int getStartingID() {
		return startingID;
	}
	public void setStartingID(int startingID) {
		this.startingID = startingID;
	}
	public int getEndingID() {
		return endingID;
	}
	public void setEndingID(int endingID) {
		this.endingID = endingID;
	}
}
