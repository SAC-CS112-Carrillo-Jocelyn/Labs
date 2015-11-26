package week12;

public class ThreeDice {

	public int Throw() {
		
		Dice Dice1 = new Dice();
		Dice Dice2 = new Dice();
		Dice Dice3 = new Dice();
		return (Dice1.Throw() + Dice2.Throw() + Dice3.Throw()) / 3;
	}
	

}
