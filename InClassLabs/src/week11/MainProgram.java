package week11;

import javax.swing.JOptionPane;

public class MainProgram {

	public static void main(String[] args) {
		Dice myDice = new Dice();
		JOptionPane.showMessageDialog
			(null, "Dice was rolled..."+ myDice.Throw());
		JOptionPane.showMessageDialog(null,myDice.Value());
		

	}

}
