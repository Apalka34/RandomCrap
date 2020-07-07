package WhatIsTheAnswerGames;//PAGE 66 

public class HeapQuiz {//Figure out what hq[]0 through hq[4] connect to id 0, 1, or 2. Not all hq's are used
	int id = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		HeapQuiz [ ] hq = new HeapQuiz[5];
		while (x < 3) {
			hq[x] = new HeapQuiz();
			hq[x].id = x;
			x = x + 1;
		}
		hq[3] = hq[1];
		hq[4] = hq[1];
		hq[3] = null;
		hq[4] = hq[0];
		hq[0] = hq[3];
		hq[3] = hq[2];
		hq[2] = hq[0];
		//Do Stuff
	}
}
//hq[0]
//hq[1] = ID 1
//hq[2]
//hq[3] = ID 2
//hq[4] = ID 0