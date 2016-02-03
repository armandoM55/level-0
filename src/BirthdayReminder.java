
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 9th";
		String dadsBirthday = "October 20th";
		String myBirthday = "Febuary 14th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String Which_birthday = JOptionPane.showInputDialog("Whos birthdy would you like to Know ");

		// 3. Print out what the user typed
		if (Which_birthday.equals("mom")) {
			JOptionPane.showConfirmDialog(null, momsBirthday);
		}
		if (Which_birthday.equals("dad")) {
			JOptionPane.showConfirmDialog(null, dadsBirthday);
		} else if
		if (Which_birthday.equals("armando")) {
			JOptionPane.showConfirmDialog(null, myBirthday);
		} else {
			JOptionPane.showConfirmDialog(null, "Sorry, I don't remember that person's birthday|");
		}

	}
	// 4. if user asked for "mom"
	// print mom's birthday
	// 5. if user asked for "dad"
	// print dad's birthday
	// 6. if user asked for your name
	// print myBirthday
	// 7. otherwise print "Sorry, i don't remember that person's birthday!"

}
