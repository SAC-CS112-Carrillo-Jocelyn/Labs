package week11;

import javax.swing.JOptionPane;

public class MainProgram {

	public static void main(String[] args) {
		int rolls;
		//L2
		/*
		Dice_L2 myDice = new Dice_L2();
		rolls=Integer.parseInt(JOptionPane.showInputDialog
			 ("Roll dice, how many times?"));
		myDice.Throw(rolls);
		JOptionPane.showMessageDialog(null,myDice.Value());
		*/
		//
		//L3
		rolls=Integer.parseInt(JOptionPane.showInputDialog
				 ("Roll dice, how many times?"));
		Dice_L3_Constructor myDice = new Dice_L3_Constructor(rolls);
		myDice.Throw();
		JOptionPane.showMessageDialog(null,myDice.Value());
		//
		
	}

}
