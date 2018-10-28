package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017

import javax.swing.JOptionPane;

//    Level 0

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your
 * friend can read it. You set up the passcode and the secret message. Your
 * friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		String PASSWORD = ("12345");
		 String SecretMessage=" I stole 1,000,000 dollars from the bank.";
		 JOptionPane.showMessageDialog(null, "You can only see the secret message if you guess the password.");
		String UserPassword= JOptionPane.showInputDialog("What is the password?");
		if(UserPassword.equals("12345")) {
				JOptionPane.showMessageDialog(null, "Hello the secret message is"+SecretMessage);
	}
		else {
			JOptionPane.showMessageDialog(null, "INTRUDER!!! GO AWAY OR ELSE :(");
		}
	// 1. Set a password in a String variable

	// 2. Using a pop-up, ask the first person for a secret message and store it in0
	// a variable

	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret
	// message
	// if they can guess the passcode

	// 4. If their guess matches the password, show them the secret message

	// 5. If the password does not match, pop-up "INTRUDER!!"

}}
