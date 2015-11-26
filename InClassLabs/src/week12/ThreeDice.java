package week12;

public class ThreeDice{
	
	int a, b, c, d; //added for lab2
	
	public int Throw() {
		
		Dice D1 = new Dice();
		Dice D2 = new Dice();
		Dice D3 = new Dice();
		
		a = D1.Throw(); b = D2.Throw(); c = D3.Throw(); //added for lab2
		return d = a + b + c / 3;
	}
	
	//added for lab2
	@Override
	public String toString(){
		return String.format("Three Dice:\n Dice One:%d\n Dice Two:%d\n "
				+ "Dice Three:%d\n Average: %d", a,b,c,d);
	}

}
