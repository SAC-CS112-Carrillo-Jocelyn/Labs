package week11;

import javax.swing.JOptionPane;

public class MainProgram {

	public static void main(String[] args) {
		Dice_L2 myDice = new Dice_L2();
		
		int rolls=Integer.parseInt(JOptionPane.showInputDialog
			 ("Roll dice, how many times?"));
		myDice.Throw(rolls);
		JOptionPane.showMessageDialog(null,myDice.Value());
		

	}

}
