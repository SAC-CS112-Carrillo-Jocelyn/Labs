package week12;

public class Dice {
	protected int d1;
	
	public int Throw(){
		
		return d1 = 1+(int)(Math.random()*6);
	}
}
