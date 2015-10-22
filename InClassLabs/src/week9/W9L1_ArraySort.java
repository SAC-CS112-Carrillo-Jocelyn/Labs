package week9;
import java.util.Arrays;
public class W9L1_ArraySort {

	public static void main(String[] args) {
		int average=0;
		int[] numbs;
		numbs = new int [6];
		numbs[0]=123;
		numbs[1]=456;
		numbs[2]=479;
		numbs[3]=135;
		numbs[4]=246;
		numbs[5]=135;
		Arrays.sort(numbs);
		
		for(int i=0; i<numbs.length; i++){
			average=average+numbs[i];
			System.out.print(numbs[i]+", ");
		}
		System.out.println("Numbers average is: "+ (average/6));
		
	}

}
