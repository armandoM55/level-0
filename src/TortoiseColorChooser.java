// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
for (int i = 0; i < 3; i++) {
	

		//3. ask the user what color they would like the tortoise to draw
		String question = JOptionPane.showInputDialog("What color would you like the tortoise to be?");
		String question2 = JOptionPane.showInputDialog("What shape would you like?");
		//4. use an if/else statement to set the pen color that the user requested
if (question.equals("red")) {
	Tortoise.setPenColor(PenColors.Reds.Crimson);
} else {
	Tortoise.setPenColor(PenColors.getRandomColor());
}
		if (question2.equals("Triangel")) {
		
		
//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
	//1. make the tortoise draw a shape (this will take more than one line of code)

	

Tortoise.move(100);
Tortoise.turn(150);
Tortoise.move(100);
Tortoise.turn(95);
Tortoise.move(50);
		}}
else {
	Tortoise.move(100);
	Tortoise.turn(90);
}
}}


