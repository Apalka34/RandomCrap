package SingleFileLessons;

import static java.lang.System.out;
import java.io.*;
import java.util.*;

class FullMoons {
	static int DAY_IM = 1000 * 60 * 60 * 24;
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2004, 0, 7, 15, 40);
		
		for (int x = 0; x < 60; x++) {
			out.println(String.format("full moon on %tc", c));
			long day1 = c.getTimeInMillis();
			day1 += (DAY_IM * 29.52);
			c.setTimeInMillis(day1);
		}
	}
}
