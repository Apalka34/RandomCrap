package PoolPuzzle;//PAGE 91
class Puzzle4b {
	int ivar;

	public int doStuff(int factor) {
		if (ivar > 100) {
			return ivar * factor;
		} else {
			return ivar * (5 - factor);
		}
	}
}
public class Puzzle4 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
//Can't use snippet's more than once
//Not all snippet's need to be used
//OUTPUT: result 543345
//U = USED
//Snippet's:
//obs.doStuff(x); || obs[x].doStuff(factor); || obs[x].doStuff(x); U || Puzzle4[] obs = new Puzzle4[6]; || Puzzle4b[] obs = new Puzzle4b[6]
//ivar = x; || obs.ivar = x; || obs[x].ivar = x; || obs[x].ivar = y; || ivar || factor U || public U || private || x = x + 1; U || x = x - 1; || short
//int U || Puzzle4 || Puzzle4b U || Puzzle4b() || ivar + factor; || ivar * (2 + factor); || ivar * (5 - factor); U || ivar * factor; U || doStuff(x);
//Puzzle4b[] obs = new Puzzle4[6]; || obs[x] = new Puzzle4b(x); || obs[]] = new Puzzle4b(); || obs[x] = new Puzzle4b(); || obs = new Puzzle4b();
		Puzzle4b[] obs = new Puzzle4b[6];
		int y = 1;
		int x = 0;
		int result = 0;
		while (x < 6) {
			obs[x] = new Puzzle4b();
			obs[x].ivar = y;
			y = y * 10;
			x = x + 1;
		}
		x = 6;
		while (x > 0) {
			x = x - 1;
			result = result + obs[x].doStuff(x);// this has to equal 543345 for the next line, also current show requires result
										// to be a double, not a int
		}
		System.out.println("result " + result);// result has to be 543345
	}
}