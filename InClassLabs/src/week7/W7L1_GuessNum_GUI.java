package week7;
import javax.swing.JOptionPane;
public class W7L1_GuessNum_GUI {
	public static void main(String[] args) {	
		int rand, userNum;
		int min=1, max=10;
		String tBig="Sorry, the number you guessed is too big. ";
		String tSmall="Sorry, the number you guessed is too small. ";
		String uString, message;
		
		rand = min+(int)(Math.random()*max);
		 userNum=
				Integer.parseInt(JOptionPane.showInputDialog //Inter.parseInt(); --Converts string to int
				(" I have a number inbetween 1 & 10, can you guess what it is? "));
		 
		if(userNum > max || userNum < min){
			message = String.format("The number %d is out of the valid range!",userNum);
			JOptionPane.showMessageDialog(null, message);
		}
		else{
			if(userNum==rand)
				JOptionPane.showMessageDialog(null, "Congratz, you guessed correctly!");
			else{
				uString =(userNum > rand)? tBig:tSmall;
				message = String.format("%s\nThe correct number was %d.", 
						uString ,rand);
				JOptionPane.showMessageDialog(null, message);
			}			
		}
	}
}
