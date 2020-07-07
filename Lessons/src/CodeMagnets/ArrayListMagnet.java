package CodeMagnets;//PAGE 161

import java.util.*;

public class ArrayListMagnet {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		if (a.contains("two")) {
			a.add("2.2");
		}
		a.add(0,"zero");
		a.add(1,"one");
		a.add(2,"two");
		a.add(3,"three");
		printAL(a);
		if (a.contains("three")) {
			a.add("four");
		}
		a.remove(2);
		printAL(a);
		if (a.indexOf("four") != 4) {
			a.add(4, "4.2");
		}
		printAL(a);
		printAL(a);
	}

	public static void printAL(ArrayList<String> al) {
		for (String element : al) {

			System.out.print(element + " "); // All one/two/three/four/4.2 have to be separated by this, so we need a
												// repeating loop that ends here.
		}
		System.out.println(" "); // This is where repeating loop must completely finish, to start it again with
									// different things to print.
	}
}

//output:
//zero one two three
//zero one three four
//zero one three four 4.2
//zero one three four 4.2