package PoolPuzzle;//PAGE 24

public class PoolPuzzleOne {

	public static void main(String[] args) {
		//I WAS WRONG(DIDNT KNOW HOW TO DO ACCIDENTLY LOOKED AT ANSWER)
		// TODO Auto-generated method stub
		//Snippet's can't be used more than once
		//Snippet's don't all have to be used
		//Output:A noise annoys an oyster
		//U = USED
		//Snippet's:
		//System.out.print(" "); U || System.out.print("a"); U || System.out.print("n"); U || System.out.print("an); || System.out.print("noys"); U
		//System.out.print("oise"); U || System.out.print(" oyster"); U || System.out.print("annoys"); || System.out.print("noise");
		//x>0 || x<1 U || x>1 U || x>3 || x<4 U || x=x+1; U || x=x+2; U || x=x-2; || x=x-1;
		int x = 0;
		while (x<4) {
			System.out.print("a");
			if (x < 1) {
				System.out.print(" ");
			}
			System.out.print("n");
			if (x>1) {
				System.out.print(" oyster");
				x = x + 2;
			}
			if (x == 1) {
				System.out.print("noys");
			}
			if (x<1) {
				System.out.print("oise");
			}
			System.out.println("");
			x = x + 1;
		}
	}

}
