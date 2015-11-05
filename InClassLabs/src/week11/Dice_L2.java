package week11;

public class Dice_L2 {
	private int diceNumber;
	private int diceBounce;
	
	public int Throw(int bounces){
		for(int i=0;i<bounces;i++){
			diceBounce=diceBounce+(1+(int)(Math.random()*6));
		}
		diceNumber = diceBounce/bounces;
		return diceNumber;
	}
	
	public int Value(){
		return diceNumber;
	}
}
