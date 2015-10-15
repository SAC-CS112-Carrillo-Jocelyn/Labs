package week8_Test;
import javax.swing.JOptionPane;
public class W8L3_YouCanDrinkIn {
	public static void main(String[] args) {
		//Can user drink?
		//If not tell em how many more years they'll have to wait till they can.
		int age, drinkingAge= 21, canDrinkIn;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("What year where you born in?"));
		age=2015-age;
		
		if(drinkingAge>=age){
			
			canDrinkIn=drinkingAge-age;
			JOptionPane.showMessageDialog(null, "You are not of drinking age."
					+ " You'll be able to drink in "+canDrinkIn+" years.");
		}
		else
			JOptionPane.showMessageDialog(null,"You can drink!");

	}

	

}
