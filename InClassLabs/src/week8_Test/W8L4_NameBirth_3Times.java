package week8_Test;
import javax.swing.JOptionPane;
public class W8L4_NameBirth_3Times {

	public static void main(String[] args) {
		//Output user name & age 3 TIMES
		String name;
		int birthYear, age;
		
		for(int i=1; i<=3; i++){
			name = JOptionPane.showInputDialog("What is your name?");
			birthYear=Integer.parseInt(JOptionPane.showInputDialog("What year where you born in?"));
			
			age=2015-birthYear;
			String outputString=String.format("Hello, %s, you're %d years old today!", name,age);
			JOptionPane.showMessageDialog(null,outputString);
		}
	}

}
