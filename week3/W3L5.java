package week3;
import java.util.Scanner;

public class W3L5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a,b;
		
		
		System.out.print("Enter a number: ");
		a = input.nextInt();
		System.out.print("Enter another number: ");
		b = input.nextInt();
		System.out.printf("You input numbers %d and %d", a, b);
		
		input.close();
		 
	}

}
