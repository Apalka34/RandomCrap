package CSTrueBattleShip;

public class NoClass {
	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";
		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			if (result.equals("hit")) {
				break;
			}
			if (result.contentEquals("kill")) {
				dotComsList.remove(dotComToTest));
				break;
			}
		}
		System.out.println(result);
	}
	private void finishGame() {
		System.out.println("All Dot Coms are dead! Your stock is now worthless.");
		if (numOfGuesses <=18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("You got out before you options sank.");
		} else {
			System.out.println("Took you long enough. "+ numOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your options");
		}
	}
	public static void main (String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}
