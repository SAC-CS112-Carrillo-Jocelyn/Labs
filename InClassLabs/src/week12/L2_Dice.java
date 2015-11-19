package week12;

public class L2_Dice {
	
	public L2_Dice(){
		diceBounces = 1;
	}
	public L2_Dice(int bounces){
		diceBounces = bounces;
	}
	
	private int diceNumb, diceAverage, diceBounces;
	

	public int Throw(int dices){
		return 1 +(int)(Math.random()*(6*dices));
	}
	public int Throw(int bounces, int dices){
		diceBounces = bounces;
		return diceNumb= dices*(BounceRand(diceBounces));
	}
	
	public int BounceRand(int bounces){
		for(int a = 1; bounces>=a; a++){
			diceAverage = diceAverage+(1+(int)(Math.random()*6));
		}
		return diceAverage/bounces;
	}
}
