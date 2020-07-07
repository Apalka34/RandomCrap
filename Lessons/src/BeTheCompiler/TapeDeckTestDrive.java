package BeTheCompiler;//PAGE 42

class TapeDeck {
	boolean canRecord = false;

	void playTape() {
		System.out.println("tape playing");
	}

	void recordTape() {
		System.out.println("tape recording");
	}
}

public class TapeDeckTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TapeDeck t = new TapeDeck();//THIS WASNT IN THE PAGE, CAUSING t TO NOT BE A VARIABLE
		t.canRecord = true;
		t.playTape();
		if (t.canRecord == true) {
			t.recordTape();
		}
	}

}
