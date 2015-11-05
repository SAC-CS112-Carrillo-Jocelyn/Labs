package week11;

public class Dice {
	private int diceNumber;
	
	public int Throw(){
		diceNumber= 1+(int)(Math.random()*6);
		return diceNumber;
	}
	
	public int Value(){
		return diceNumber;
	}
}
