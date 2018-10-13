package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Remarkable {

	public static void main(String[] args) {
		String zack= "very, very remarkable";
		String miceal="super remarkable";
		String datdude ="more remarkable than miceal";
		String HAHA = JOptionPane.showInputDialog("Write your name in the box below.");
		if(HAHA.equals("miceal")) {
		JOptionPane.showMessageDialog(null, miceal);
		}
	
        if(HAHA.equals(zack)) {
JOptionPane.showMessageDialog(null,"zack");
        }
        
        if(HAHA.equals("datdude")) {
JOptionPane.showMessageDialog(null,"datdude");
        }
}
}
}
