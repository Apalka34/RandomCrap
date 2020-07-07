package CSGuessGame;//PAGE 38-40

public class GuessGame {														//GuessGame has three instance
	Player p1;																	//variables for the three Player
	Player p2;																	//objects
	Player p3;																	

	public void startGame() {													//create three Player objects and
		p1 = new Player();														//assign them to the three Player
		p2 = new Player();														//instance variables
		p3 = new Player();														

		int guessp1 = 0;														//declare three variables to hold the
		int guessp2 = 0;														//three guesses the Players make
		int guessp3 = 0;														
		
		boolean p1isRight = false;												//declare three variables to hold a true or
		boolean p2isRight = false;												//false based on the player's answer
		boolean p3isRight = false;												

		int targetNumber = (int) (Math.random() * 10);							//make a 'target' number that the
		System.out.println("I'm thinking of a number between 0 and 9...");		//players have too guess
		
		while (true) {															
			System.out.println("Number to guess is " + targetNumber);		
			
			p1.guess();															//call each player's guess() method
			p2.guess();															
			p3.guess();															
			
			guessp1 = p1.number;												//get each player's guess (the result of their
			System.out.println("Player one guessed " + guessp1);				//guess() method running) by accessing the
																				//number variable of each player
			guessp2 = p2.number;												
			System.out.println("Player two guessed " + guessp2);				
																				
			guessp3 = p3.number;												
			System.out.println("Player three guessed " + guessp3);				
		
			if (guessp1 == targetNumber) {										//check each player's guess to see if it matches
				p1isRight = true;												//the target number. If a player is right,
			}																	//then set that player's variable to be true
			if (guessp2 == targetNumber) {										//(remember, we set it false by default)
				p2isRight = true;												
			}																	
			if (guessp3 == targetNumber) {										
				p3isRight = true;												
			}																	
			
			if (p1isRight || p2isRight || p3isRight) {							//if player one Or player two Or player three is right... (the || operator means OR)

				System.out.println("We have a winner");							
				System.out.println("Player one got it right? " + p1isRight);	
				System.out.println("Player two got it right? " + p2isRight);	
				System.out.println("Player three got it right? " + p3isRight);	
				System.out.println("Game is over.");							
				break; // game over, so break out of the loop					
				
			} else {															//otherwise, stay in the loop and ask the players for another guess
				// we must keep going because nobody got it right!				
				System.out.println("Players will have to try again.");			
			} // end if/else													
		} // end loop															
	} // end method																
} // end class																	