package MixedMessages;//PAGE 192

class A {
	int invar = 7;

	void m1() {
		System.out.print("A's m1, ");
	}

	void m2() {
		System.out.print("A's m2, ");
	}

	void m3() {
		System.out.print("A's m3, ");
	}
}

class B extends A {
	void m1() {
		System.out.print("B's m1, ");
	}
}

class C extends B {
	void m3() {
		System.out.print("C's m3, " + (invar + 6));
	}
}

public class Mixed2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		C c = new C();
		A a2 = new C();
		b.m1();
		c.m2();
		a.m3();
	}
}
//Code Candidates:	||Possible Output				||Output: 
//b.m1();			||A's ,1, A's m2, C's m3, 6		||
//c.m2();			||B's m1, A's m2, A;s m3,		||
//a.m3();			||A's m1, B's m2, A;s m3,		||
//					||B's m1, A's m2, c's m3, 13	||
//c.m1();			||B's m1, A's m2, C's, m3, 		||
//c.m2();			||B's m1, C's m2, A;s m3		||
//c.m3();			||B's m1, A's m2, C's m3, 6		||
//					||A's m1, A's m2, C's m3, 13	||
//a.m1();			||								||
//b.m2();			||								||
//c.m3();			||								||
//					||								||
//a2.m1();			||								||
//a2.m2();			||								||
//a2.m3();			||								||