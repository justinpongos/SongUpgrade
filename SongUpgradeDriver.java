
public class SongUpgradeDriver {

	public static void main(String[]args) {
	SongUpgrade song1 = new SongUpgrade("3:43", "Mr.Brightside", "The Killers", 223);
	System.out.println("original: "+ song1.getlengthInSecs());
	song1.setlengthInSecs(343);
	System.out.println("new: "+ song1.getlengthInSecs());
	System.out.println(song1);
	}//end main
}//end class
