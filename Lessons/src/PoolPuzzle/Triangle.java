package PoolPuzzle;//PAGE 65

public class Triangle {
	double area;
	int height;
	int length;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Snippet's can be used more than once
		//Snippet's don't all have to be used
		//Output:A noise annoys an oyster
		//U = USED
		//Snippet's:
		//area || ta.area || ta.x.area || ta[x].area || x || y || int x; || int y; || int x=0; || int x=1; || int y=x; || x=x+1; || x=x+2; || x=x-1;
		//ta.x || ta(x) || ta[x] || x<4 || x<5 || 28.0 || 30.0 || ta[x]=setArea(); || ta.x=setArea(); || ta[x].setArea();
		//Triangle[] ta = new Triangle(4); || Triangle ta = new[] Triangle[4]; || Triangle[] ta = new Triangle[4]; || ta = new Triangle();
		//ta[x] = newTriangle(); || ta.x = new Triangle(); || 4, t5 area = 18.0 || 4, t5 area = 343.0 || 27, t5 area = 18.0 || 27, t5 area = 343.0
		int x = 0;
		Triangle[] ta = new Triangle[4];
		while (x < 4) {
			ta[x] = new Triangle();
			ta[x].height = (x + 1) * 2;
			ta[x].length = x + 4;
			ta[x].setArea();
			System.out.print("triangle "+x+", area");
			System.out.println(" = " + ta[x].area);
			x = x + 1;
		}
		int y = x;
		x = 27;
		Triangle t5 = ta[2];
		ta[2].area = 343;
		System.out.print("y = " + y);
		System.out.println(", t5 area = "+ t5.area);
	}
	void setArea() {
		area = (height * length) / 2;
	}

}
