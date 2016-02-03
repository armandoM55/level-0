
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;



public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int random =new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(random);
	// 4. Get the user to enter a question for the 8 ball
String number = JOptionPane.showInputDialog("What is your question"); 
	// 5. If the random number is 0
if (0==random) {
JOptionPane.showConfirmDialog(null, "yes");
}
	// -- tell the user "Yes"
if (1==random) {
	JOptionPane.showConfirmDialog(null, "no"); 
}
if (2==random) {
	JOptionPane.showConfirmDialog(null, "maybe you should ask google");
} 
if (3==random) {
	JOptionPane.showConfirmDialog(null, "GG M8");
}
	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}}



