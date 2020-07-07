package PoolPuzzle;//PAGE 44

class Echo {
	int count = 0;

	void hello() {
		System.out.println("helloooo...");
	}
}

public class EchoTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Snippet's can be used more than once
		//Snippet's don't all have to be used
		//Output:A noise annoys an oyster
		//U = USED
		//Snippet's:
		//e1=e1+1; || e1=count+1; || e1.count=count+1; || e1.count=e1.count+1; U || e2=e1; || Echo e2; || Echo e2=e1; || Echo e2=new Echo(); U
		//x || y || e2 || count U || x<4 U || x<5 || x>0 U || x>1 U || x==3 || x==4 || Echo U || Tester || echo() || count() || hello() U
		Echo e1 = new Echo();
		Echo e2 = new Echo();
		int x = 0;
		while (x<4) {
			e1.hello();
			e1.count = e1.count + 1;
			if (x > 0) {
				e2.count = e2.count + 1;
			}
			if (x > 1) {
				e2.count = e2.count + e1.count;
			}
			x = x + 1;
		}
		System.out.println(e2.count);
	}

}
