package week12;

public class ThreeDice{

	public int Throw() {
		
		Dice D1 = new Dice();
		Dice D2 = new Dice();
		Dice D3 = new Dice();
		return (D1.Throw() + D2.Throw() + D3.Throw()) / 3;
	}
	

}
