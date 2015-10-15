package week8_Test;
import javax.swing.JOptionPane;
public class W8L2_DrinkingAge {

	public static void main(String[] args) {
		int age, drinkingAge= 21;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("What year where you born in?"));
		age=2015-age;
		if(drinkingAge>=age){
			JOptionPane.showMessageDialog(null, "You are not of drinking age.");
		}
		else
			JOptionPane.showMessageDialog(null,"You can drink!");

	}

}
