package BeTheCompiler;//PAGE 88

class Clock {
	String time;

	void SetTime(String t) {
		time = t;
	}

	String getTime() {//Change void to String
		return time;
	}
}

public class ClockTestDrive {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c = new Clock();
		c.SetTime("1245");;
		String tod = c.getTime();
		System.out.println("time: " + tod);
	}

}
