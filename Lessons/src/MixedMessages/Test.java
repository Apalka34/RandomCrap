package MixedMessages;//PAGE 23

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 0;
//		int y = 0;
//		while (x < 5) {
//INSERT
//			System.out.print(x + "" + y + " ");
//			x = x - 1;
//		}
//CANDIDATES:			POSSIBLE OUTPUT:			CORRECT OUTPUT:
//y = x - y;			24 46						00 11 21 32 42
		
//y = y + x;				11 34 59				00 11 23 36 410
		
//y = y + 2;			02 14 26 38					02 14 25 36 47	
//if (y>4) {
//y = y - 1;
//}
		
//x = x + 1;			02 14 36 48					11 34 59	
//y = y + x;
		
//if (y<5) {			00 11 21 32 42				02 14 36 48
//x = x + 1;
//if (y<3) {
//x = x - 1;
//	}
//}
//y = y + 2;
//						11 21 32 42 53				
//						00 11 23 36 410				
//						02 14 25 36 47				
//TESTING AREA
		int x = 0;
		int y = 0;
		while (x<5) {
			if (y<5) {
				
			System.out.print(x + "" + y +" ");
			x = x + 1;
		}
	}
	}
}
