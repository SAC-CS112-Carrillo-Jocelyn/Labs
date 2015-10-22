package week9;

import javax.swing.JOptionPane;

public class W9L2_OddEven_GameHistory {

	public static void main(String[] args) {
		int diceNumb, remainder, d=-1, roundsPlayed=0;
		int winNumb=0, oddNumb=0, evenNumb=0, maxRounds=9;
		String oddOrEven, likeToPlayAgain;
		boolean playAgain=false;
		String[] guess  = new String[maxRounds];
		String[] compNumb  = new String[maxRounds];
		String[] winOrLose = new String[maxRounds];
				
		//Start
		do
		{
			JOptionPane.showMessageDialog(null, "Throw a dice!");
			diceNumb= 1+(int)(Math.random()*6); //make random #
			oddOrEven=(JOptionPane.showInputDialog(null,
					"Do you think the number rolled is odd or even?").toLowerCase());
	
			//a odd # will have a remainder of 1, while a even # will have a remainder of 0
			remainder = diceNumb%2; 
			
			//Logic
			if(oddOrEven.equals("odd")||oddOrEven.equals("even"))
			{
				switch(oddOrEven)
				{
				case "odd":
					d=1; oddNumb++;
					guess[roundsPlayed]="odd";//results
					break;
				case "even":
					d=0; evenNumb++;
					guess[roundsPlayed]="even";//results
					break;
				}
				
				if(d==remainder){
					winNumb++;//results
					winOrLose[roundsPlayed]="won round " +(roundsPlayed+1);//results
					JOptionPane.showMessageDialog(null, "You guessed correctly!");
				}
				else{
					winOrLose[roundsPlayed]="lost round " +(roundsPlayed+1);//results
					JOptionPane.showMessageDialog(null, "You guessed wrong. :<");
				}
				compNumb[roundsPlayed]=Integer.toString(diceNumb);//results
				
				//PlayAgain? only if:
				if(roundsPlayed<maxRounds)
				{
					likeToPlayAgain= JOptionPane.showInputDialog
							(" Would you like to play again? Yes=y or No=n");
					
					if(likeToPlayAgain.toLowerCase().equals("y")
							||likeToPlayAgain.toLowerCase().equals("yes"))
						playAgain=true;
					else
						playAgain=false;	
				}
				roundsPlayed++;
				//If playAgain is false Show History
				if(!playAgain)
				{
					String message ="Game History: ";
					String message2= " ";
					message2=message2.format("\n Overall you won %s times. "
							+ "Chose odd %s times and even %s times. ", winNumb,oddNumb,evenNumb);
					
					for(int i=0; i<guess.length; i++)
					{	
						if(guess[i]==null){
						}
						else{
							message=message.format(message+"\n You %s by choosing %s. "
								+ "Computer chose %s. ",winOrLose[i],guess[i],compNumb[i] );
						}
					}
					JOptionPane.showMessageDialog(null, message+message2);	
				}		
			}
			else
			{	
				JOptionPane.showMessageDialog(null, "Invalid input. Try Again.");
				playAgain=true;
			}

		}while(playAgain);
	}
}
