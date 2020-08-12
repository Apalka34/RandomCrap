package SingleFileLessons;

public class XCopy {
	public static void main(String[] args) {
		int orig = 42;
		XCopy x = new XCopy();
		int y = x.go(orig);
		System.out.println(orig + " " + y);
	}

	int go(int arg) {
		arg = arg * 2;
		return arg;
	}
}

//Prints 42 84 because orig is 42, and y is orig, but has go, and in int go, orig = arg, and arg = arg * 2