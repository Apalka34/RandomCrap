package BeTheCompiler;
class StaticSuper {
	static {
		System.out.println("super static block");
	}
	StaticSuper {
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
	public static void main(String [] args) {
		System.out.println("in main");
		StaticTests st = new StaticTests();
	}
}
//Won't compile because line 6 should be "StaticSuper() {" rather than "StaticSuper {". Also if we did add the parantheses then it could be either of 
//the possible Output's because the number 4/3 after static block, is randomized 0-6, allowing it to be either, or be neither.