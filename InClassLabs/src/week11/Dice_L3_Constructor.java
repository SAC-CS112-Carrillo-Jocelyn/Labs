package week11;

public class Dice_L3_Constructor {
	private int diceNumber;
	private int diceAveraging;
	private int diceThrows;
	
	public Dice_L3_Constructor(int bounces){
		diceThrows=bounces;
	}
	public Dice_L3_Constructor(){
		diceThrows=2;
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
