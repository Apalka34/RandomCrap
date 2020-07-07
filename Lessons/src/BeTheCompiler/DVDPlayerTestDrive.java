package BeTheCompiler;//PAGE 42

class DVDPlayer {
	boolean canRecord = false;

	void recordDVD() {
		System.out.println("DVD recording");
	}
	void playDVD() {//DID NOT HAVE THIS CODE CAUSING NO OUTPUT
		System.out.println("DVD playing");
	}
}

public class DVDPlayerTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		d.playDVD();
		if (d.canRecord == true) {
			d.recordDVD();
		}
	}

}
