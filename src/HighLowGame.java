 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(50);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their respons
	String Question=JOptionPane.showInputDialog(null, "Guess what number between 1-100");
		JOptionPane.showMessageDialog(null, Question);
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
	int Number=		Integer.parseInt(Question);
			// 5. if the guess is correct 
	if (Number==random) {
		JOptionPane.showConfirmDialog(null, "correct");
	}
				// 6. win
			// 7. if the guess is high
	if (Number<random) {
		JOptionPane.showConfirmDialog(null, "it is higher than that");
	} 
		if (Number>random) {
			JOptionPane.showConfirmDialog(null, "it is lower");
		}
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low
		else{
			JOptionPane.showMessageDialog(null, "You Lose");	
		}
		}
		// 12. tell them they lose
		
		
	}

}

