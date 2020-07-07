package MovieTestDrive;//PAGE 37
class Movie {
	String title;
	String Genre;
	int rating;

	void playIt() {
		System.out.println("Playing the movie");
	}
}

public class MovieTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie one = new Movie();
		one.title = "Gone with the stock";
		one.Genre = "Tragic";
		one.rating = -2;
		Movie two = new Movie();
		two.title = "Lost in Cubicle Space";
		two.Genre = "Comedy";
		two.rating = 5;
		two.playIt();
		Movie three = new Movie();
		three.title = "Byte Club";
		three.Genre = "Tragic but ultimatly uplifting";
		one.rating = 127;
	}

}
