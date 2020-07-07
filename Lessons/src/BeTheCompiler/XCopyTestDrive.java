package BeTheCompiler;//PAGE 88
class XCopy {//Create class XCopy and move lines 3-6 into the new class
	int go(int arg) {
		arg = arg * 2;
		return arg;
	}
}
public class XCopyTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orig = 42;
		XCopy x = new XCopy();
		int y = x.go(orig);
		System.out.println(orig + " " + y);
	}
}
