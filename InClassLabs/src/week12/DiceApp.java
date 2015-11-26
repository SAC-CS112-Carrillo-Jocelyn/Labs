package week12;
//main program
public class DiceApp {

	public static void main(String[] args) {
		ThreeDice dice = new ThreeDice();
		Dice d = new Dice();
		
		int i = d.Throw();
		int iThrow = dice.Throw(); 
		System.out.println("Dice # is: " + i);
		System.out.println("3 Dice throw is: " + iThrow);
		System.out.println("ThreeDice: "+ dice.toString());

	}
}
