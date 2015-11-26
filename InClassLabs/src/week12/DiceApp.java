package week12;
//main program
public class DiceApp {

	public static void main(String[] args) {
		TrippleDice ddd = new TrippleDice();
		ThreeDice dice = new ThreeDice();
		Dice d = new Dice();
		
		
		int i = d.Throw();
		int iThrow = dice.Throw(); 
		System.out.println("Dice # is: " + i);
		System.out.println("ThreeDice is: "+ iThrow);
		
		//added for lab2
		//System.out.println("dice.toString() = " + dice.toString());
		//System.out.println("d.toString() = "+ d.toString());
		
		//added for lab3
		//System.out.println(dice.toString());
		
		//added for lab4
		System.out.println(ddd.Throw3());
	}
}
