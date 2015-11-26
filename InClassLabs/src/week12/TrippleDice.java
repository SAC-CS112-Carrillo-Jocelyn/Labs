package week12;

public class TrippleDice extends Dice{
	private int d2, d3, r;
	
	@Override
	public int Throw(){
		
		d1 = super.Throw();
		d2 = super.Throw();
		d3 = super.Throw();
		
		return r = d1 + d2 + d3 / 3;
	}
	
	@Override
	public String toString(){
		return String.format("Three Dice:\n Dice One:%d\n Dice Two:%d\n "
				+ "Dice Three:%d\n Average: %d", d1, d2, d3,r);
	}

}
