package SingleFileLessons;

class StaticSuper {
	
	static {
		System.out.println("super static block");
	}
	
	StaticSuper() {
		System.out.println("super constructer");
	}
}


public class StaticTests extends StaticSuper {
	static int rand;
	
	static {
		rand = (int) (Math.random() * 6);
		System.out.println("static block " + rand);
	}
	
	StaticTests() {
		System.out.println("constructer");
	}
	
	public static void main(String[] args) {
		System.out.println("in main");
		StaticTests st = new StaticTests();
	}
}

//To fix it, you need to add () after the second StaticTests in line 29, and () after StaticSuper in line 9.
//If it did compile it would print out either of the 2, or neither, because the number after static block can be 0, 1, 2, 3, 4, or 5.