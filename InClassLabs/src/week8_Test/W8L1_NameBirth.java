package week8_Test;

import javax.swing.JOptionPane;

public class W8L1_NameBirth {

	public static void main(String[] args) {
		String name;
		int birthYear, age;
		
		name = JOptionPane.showInputDialog("What is your name?");
		birthYear=Integer.parseInt(JOptionPane.showInputDialog("What year where you born in?"));
		
		age=2015-birthYear;
		String outputString=String.format("Hello, %s, you're %d years old today!", name,age);
		JOptionPane.showMessageDialog(null,outputString);

	}

}
