package SharpenYourPencil;//PAGE 291

public class TestBox {
	Integer i;
	int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBox t = new TestBox();
		t.go();
	}
	public void go() {
	j=i;
	System.out.println(j);
	System.out.println(i);
	}
}
//It would work, but it doesn't work, because while int default is 0, Integer has no default, so it says null. It would compile if it said "Integer i = 
//(number)" and the next line could say "int j;" like it does. But Integer have no default, while int default is zero. It compiles but it turns it null.