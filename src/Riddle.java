import javax.swing.JOptionPane;

public class Riddle {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score=50;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
String Riddle =JOptionPane.showInputDialog("If there is an old boat and each day it is being replaced by new wood and it is finally finished which one is the original");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (Riddle.equals("the first one")) { 
	JOptionPane.showMessageDialog(null, ("correct"));
	score=score+50;
	}
	else { 
JOptionPane.showMessageDialog(null, "Wrong, its the first one");
score=score-50;
	}
		
		// 6. Add some more riddles
String secondR =JOptionPane.showInputDialog("the house with red bricks is a red house, the the house with blue bricks is a blue house what is a house made of glass called");
if (secondR.equals("green house")) {
JOptionPane.showConfirmDialog(null, "correct"); 
score=score+50;
} else {
JOptionPane.showConfirmDialog(null, "wrong");
score=score-50;
}
		// 2. Make a pop up to show the score.
JOptionPane.showConfirmDialog(null, score);		
	}
}

