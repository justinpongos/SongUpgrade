
public class SongUpgrade {
	//instance variables
	private String length;
	private String name;
	private String madeby;
	private int lengthInSecs;
		
	public SongUpgrade(String length, String name, String madeby, int lengthInSecs) {
		this.length = length;
		this.name= name;
		this.madeby = madeby;
		this.lengthInSecs = lengthInSecs;
	}//end argument instructor
	public int getlengthInSecs() {
		return lengthInSecs;
	}//end getter
	
	public void setlengthInSecs(int newSeconds) {
		this.lengthInSecs = newSeconds;
	}//end setter
	
	public String convertToMinSec() {
		int mins = lengthInSecs/60;
		int secs = lengthInSecs % 60;
		String length = "The length of the song is: " + mins + " minutes and " + secs + " seconds";
		return length;
	}//end method
	
	public String toString() {
		String output;
		output = "The songs name is " + name + " by " + madeby + " and the length is " + length + "\n" + convertToMinSec();
		return output;
	}//end toString
}//end class