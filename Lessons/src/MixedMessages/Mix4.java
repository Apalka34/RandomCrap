package MixedMessages;//PAGE 90

public class Mix4 {
int counter = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//_ = INSERT HERE
		// // = UNDERSCORE AREA (ALWAYS IN PARANTHESES
		//CANDIDITES: 	| OUTPUTS:	| ANSWER:
		//x < 9       	| 14 7		| 14 1
		//index < 5		| 9 5		|
		//				| 19 1		|
		//x < 20		| 14 1		| 25 1
		//index < 5		| 25 1		|
		//				| 7 7		|
		//x < 7			| 20 1		| 14 1
		//index < 7		| 20 5		|
		//				|			|
		//x < 19		|			| 20 1
		//index < 1		|			|
		int count = 0;
		Mix4[] m4a = new Mix4[20];
		int x = 0;
		while (_) {//
			m4a[x] = new Mix4();
			m4a[x].counter = m4a[x].counter + 1;
			count = count + 1;
			count = count + m4a[x].maybeNew(x);
			x = x + 1;
		}
		System.out.println(count + " "+ m4a[1].counter);
	}
	public int maybeNew(int index) {
		if(_) {//
			Mix4 m4 = new Mix4();
			m4.counter = m4.counter + 1;
			return 1;
		}
		return 0;
	}

}
