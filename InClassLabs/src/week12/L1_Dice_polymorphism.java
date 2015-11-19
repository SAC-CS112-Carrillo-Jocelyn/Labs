package week12;

public class L1_Dice_polymorphism {
	
	private int diceNumb;
	private int diceAverage;
	
	public int Throw(int dices){
		return 1 +(int)(Math.random()*(6*dices));
	}
	public int Throw(int bounces, int dices){
		
			for(int a = 1; bounces>=a; a++){
				diceAverage = diceAverage+(1+(int)(Math.random()*6));
			}
			diceAverage = diceAverage/bounces;
		
		return diceNumb= dices*diceAverage;
	}
}
