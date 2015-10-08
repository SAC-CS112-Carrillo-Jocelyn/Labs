package week7;

import javax.swing.JOptionPane;

public class W7L3_RockPaperScisssor_Switch {
	public static void main(String[] args) {
		int comp;
		boolean again;
		String userMove, compMove;
		String r = "Rock";
		String p = "Paper";
		String s = "Scissors";
			
		//Start
		
		//Set CompMove
		comp = (1+(int)(Math.random()*3));

		switch(comp){
		case 1:
			compMove=r;
			break;
		case 2:
			compMove=p;
			break;
		default:
			compMove=s;
		}
		
		//Get UserMove
		do
		{ 	again = false;	
			
			userMove = JOptionPane.showInputDialog("Lets play Rock, Paper, Scissors. Choose your weapon! ");
			switch(userMove.toLowerCase()){
			case "r":
				userMove=r;
				break;
			case "rock":
				userMove=r;
				break;
			case "p":
				userMove=p;
				break;
			case "paper":
				userMove=p;
				break;
			case "s":
				userMove=s;
				break;
			case "scissor":
				userMove=p;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Not a valid input, try again.");
				again=true;	
			
			}
			//JOptionPane.showMessageDialog(null, compMove + userMove);//Debug
		}
		while(again); //Repeat until user enters a valid input
		
		String win  =String.format("You chose %s, computer chose %s. You won!", userMove,compMove);
		String lose =String.format("You chose %s, computer chose %s. You lost!", userMove,compMove);
		
		//Compare compMove & userMove to see who won
		if(userMove.equals(compMove))
			JOptionPane.showMessageDialog(null, " Tie!");
		
		switch(userMove){
		case "Rock":
			switch(compMove){
				case "Scissors":
					JOptionPane.showMessageDialog(null,win);
					break;
			}
			break;
		case "Paper":
			switch(compMove){
			case "Rock":
				JOptionPane.showMessageDialog(null,win);
				break;
			}
			break;
		case "Scissors":
			switch(compMove){
			case "Paper":
				JOptionPane.showMessageDialog(null,win);
				break;
			}
			break;
		default:
			JOptionPane.showMessageDialog(null,lose);
		}
	}
}
