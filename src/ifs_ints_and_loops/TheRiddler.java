package ifs_ints_and_loops;


import javax.swing.JOptionPane;

//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		int SCORE=0;

		// 1. Make a variable to hold the score
String Riddle1=JOptionPane.showInputDialog("Imagine you are in a dark room with no windows doors or any openings. How do you get out");
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
if( Riddle1.equals("Stop imagining")){

	JOptionPane.showMessageDialog(null, "Correct!   Now your score is 1");
	SCORE=SCORE +1;
}
else {
	JOptionPane.showMessageDialog(null, "You are wrong try again next time!!! >:) MWAHAHAHAHA!!! But the correct answer is Stop imagining !!!");
}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
}
}