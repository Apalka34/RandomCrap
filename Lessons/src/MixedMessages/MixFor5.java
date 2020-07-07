package MixedMessages;

public class MixFor5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;//0
		int y = 30;//30
		for (int outer = 0; outer < 3; outer++) {//0
			for (int inner = 4; inner > 1; inner --) {//4
				x = x + 0;
				y = y - 2;
				if (x == 6) {
					break;
				}
				x = x + 3;
			}
			y = y - 2;
		}
		System.out.println(x + " " + y);
	}

}
//Candidates:	| Possible output:	| Guess:	| Answer:
//x = x + 3;	| 45 6				| ???		| 54 6
//x = x + 6;	| 36 6				| 60 10		| 60 10
//x = x + 2;	| 54 6				| 45 6		| 45 6
//x++;			| 60 10				| 36 6		| 36 6
//x--;			| 18 6				| 18 6		| 18 6
//x = x + 0;	| 6 14				| 6 14		| 6 14
//				| 12 14	
