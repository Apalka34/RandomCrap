package SingleFileLessons;

public class GC {
	public static GC doStuff() {
		GC newGC = new GC();
		doStuff2(newGC);
		return newGC;
	}
	
	public static void main(String[] args) {
		GC gc1;
		GC gc2 = new GC();
		GC gc3 = new GC();
		GC gc4 = gc3;
		gc1 = doStuff();
		//Location A
	}
	
	public static void doStuff2(GC copyGC) {
		GC localGC = copyGC;
	}
}

//Guess: 																							//Answer:		//Correct: 
//1: N because it will also make localGC null because localGC = copyGC.								//N				//Y
//2: Y because its not used.																		//Y				//Y
//3: Y because while gc3 is trashed, the gc4 shouldn't change.										//N				//N
//4: Y because its not used.																		//Y				//Y
//5: N because 2 of them (gc2 and gc3) are in new GC, but all of them might be a new GC.			//N				//Y
//6: Y because its not used.																		//N				//N
//7: Y because it deletes the current gc3, and turns gc3 into gc2.									//N				//N
//8: Y because gc1 gets deleted, but gc1 turns to gc4, which turns to gc3							//Y				//Y
//9: N because gc4 = gc3.																			//N				//Y