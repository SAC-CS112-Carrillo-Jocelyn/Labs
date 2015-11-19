package week12;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		L1_Dice_polymorphism Dice = new L1_Dice_polymorphism();
		Scanner input= new Scanner(System.in);
		
		System.out.println("Use method 1 or 2?");
		int method = input.nextInt();
		
		if(method ==1){
			System.out.println("How many dice to roll?");
			int a = input.nextInt();
			System.out.println("# Rolled is "+ Dice.Throw(a));
		}
		else if(method==2){
			System.out.println("How many bounces per dice?");
			int a = input.nextInt();
			System.out.println("How many dice to roll?");
			int b = input.nextInt();
			System.out.println("# Rolled is "+ Dice.Throw(a,b));
		}
		else
			System.out.println("Invalid input, try again.");
		
	}

}
