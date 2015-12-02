// Copyright Wintriss Technical Schools 2013

import javax.swing.JOptionPane;
/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration { 
	public static void main(String[] args) {
		String Name= JOptionPane.showInputDialog("What is your first name"); 
		String LastName= JOptionPane.showInputDialog("What is your last name"); 
		String Destination= JOptionPane.showInputDialog("Where is your destination"); 
		String Birthdate= JOptionPane.showInputDialog("what is your date of bith"); 
		String Gender= JOptionPane.showInputDialog("what is your gender"); 
		JOptionPane.showMessageDialog(null,  "Name:"+Name+ "Last Name:"+ LastName+ "Destination:"+ Destination+ "Birthdate:"+ Birthdate+ "Gender:"+ Gender);
	}
}
