package PoolPuzzle;//PAGE 194

class Rowboat extends Boat {
	public void rowTheBoat() {
		System.out.print("Stroke natasha"); //Useless, don't use.
	}
}
//________________________________________________________________________________________________
class Boat {
	private int length;
	public void setLength (int len) {
		length = len;
	}
	public int getLength() {
		return length;
	}
	public void move() {
		System.out.print("drift "); //Either "hoist sail" or "drift", if drift needs to happen twice
	}
}
//________________________________________________________________________________________________
public class TestBoats {

	public static void main(String[] args) {
		Boat b1 = new Boat();
		Sailboat b2 = new Sailboat();
		Rowboat b3 = new Rowboat();
		b2.setLength(32);
		b1.move();
		b3.move();
		b2.move();
	}
}
//________________________________________________________________________________________________
class Sailboat extends Boat {
	public void move() {
		System.out.print("hoist sail"); //Either "hoist sail" or "drift", if drift needs to happen twice
	}
}