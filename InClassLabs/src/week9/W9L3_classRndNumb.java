package week9;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class W9L3_classRndNumb {
	
	public static int NumberGenerator(){
		int a = 1+(int)(Math.random()*10);
		return a;
	}

	public static void main(String[] args) {
		int diceNumb, remainder,d=-1;
		String oddOrEven;
		Scanner input=new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Throw a dice!");
		diceNumb= NumberGenerator();
		oddOrEven=(JOptionPane.showInputDialog(null, "Do you think the number rolled is odd or even?").toLowerCase());

		//a odd # will have a remainder of 1, while a even # will have a remainder of 0
		remainder = diceNumb%2; 
		System.out.print(diceNumb +" "+ remainder);//Debug
		
		if(oddOrEven.equals("odd")||oddOrEven.equals("even")){
			switch(oddOrEven){
			case "odd":
				d=1;break;
			case "even":
				d=0;break;
			}
			if(d==remainder)
				JOptionPane.showMessageDialog(null, "You guessed correctly!");
			else
				JOptionPane.showMessageDialog(null, "You guessed wrong. :<");
		}
		else
			JOptionPane.showMessageDialog(null, "Invalid input. Try Again.");
	}
}




