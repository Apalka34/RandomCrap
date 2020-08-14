package SingleFileLessons;

public class MonsterTestDrive {
	public static void main(String[] args) {
		Monster[] ma = new Monster[3];
		ma[0] = new Vampire();
		ma[1] = new Dragon();
		ma[2] = new Monster();
		for (int x = 0; x < 3; x++) {
			ma[x].frighten(x);
		}
	}
}

class Monster {
	boolean frighten(int d) {
		System.out.println("arrrgh");
		return true;
	}
}

class Vampire extends Monster {
	boolean frighten(int x) {
		System.out.println("a bite");
		return false;
	}
}

class Dragon extends Monster {
	boolean frighten(int defree) {
		System.out.println("breath fire");
		return true;
	}
}

//Guess:												//Answer:
//4 because if im correct, byte goes before int.		//I was wrong

//Guess #2:												//Answer #2:
//3 because it returns Monster as false.				//I was wrong

//Guess #3:												//Answer #3:
//2 because return is B is a number.					//Wont even compile

//Guess #4: 											//Answer #4:
//1 because return for Vampire is false.				//Correct