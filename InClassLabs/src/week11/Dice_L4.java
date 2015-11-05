package week11;

public class Dice_L4 {
	private int diceNumber;
	private int diceAveraging;
	private int diceThrows;
	
	public Dice_L4(int bounces){
		diceThrows=bounces;
	}
	public Dice_L4(){
		diceThrows=1;
	}
	static int OneThrow(){
		return 1+(int)(Math.random()*6);
	}
	public int Throw(){
		for(int i=0;i<diceThrows;i++){
			diceAveraging=diceAveraging+Random(1,6);
		}
		diceNumber = diceAveraging/diceThrows;
		return diceNumber;
	}
	public int Throw(int bounces){
		for(int i=0;i<bounces;i++){
			diceAveraging=diceAveraging+Random(1,6);
		}
		diceNumber = diceAveraging/bounces;
		return diceNumber;
	}
	public int Value(){
		return diceNumber;
	}
	private int Random(int low, int high){
		
		return low+(int)(Math.random()*high);
	}
}
