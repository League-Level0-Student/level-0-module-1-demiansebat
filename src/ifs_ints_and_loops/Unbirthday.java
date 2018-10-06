package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String LOL = JOptionPane.showInputDialog("What is the date of your birthday?");
		if (LOL.equals("10/5")) {
			JOptionPane.showMessageDialog(null, "Have a very happy birthday!");

		} else {
			JOptionPane.showMessageDialog(null, "Have a very sad unbirthday :(");
		}
	}
}