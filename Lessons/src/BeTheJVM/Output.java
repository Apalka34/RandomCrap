package BeTheJVM;//PAGE 118

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Output o = new Output();
		o.go();
	}
	void go() {
		int y = 7;
		for (int x = 1; x < 8; x++) {//x turns to 8
			y++;
			if (x > 4) {
				System.out.print(++y + " ");// prints out what y is
			}
			if (y > 14) {//wont work if y is 14 or less
				System.out.println(" x = " + x);//prints out x
				break;
			}
		}
	}
}
//IS THE OUTPUT:	//
//12 14				//WONT WORK BECAUSE THERES NO x = 
//12 14 x = 6		//WONT WORK BECAUSE y IS NEVER 15+
//13 15 x = 6		//PROCCESS OF ELIMINATION MEANS THIS IS THE ANSWER