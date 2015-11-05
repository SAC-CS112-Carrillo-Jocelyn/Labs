package week11;

import javax.swing.JOptionPane;

public class MainProgram {

	public static void main(String[] args) {
		int rolls;
		//L2
		Dice_L2 myDice = new Dice_L2();	
		//myDice.Throw(rolls);
		//
		//L3
		//Dice_L3_Constructor myDice = new Dice_L3_Constructor(rolls);
		//myDice.Throw();
		
		//L4
		rolls=Integer.parseInt(JOptionPane.showInputDialog
				 ("Roll dice, how many times?"));
		if(rolls==1){
			JOptionPane.showMessageDialog(null,Dice_L4.OneThrow());
		}
		else{
			myDice.Throw(rolls);
			JOptionPane.showMessageDialog(null,myDice.Value());	
		}
	}

}
