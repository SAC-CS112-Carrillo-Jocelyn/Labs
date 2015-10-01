package week5;
import java.util.Scanner;

public class W5 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int a;
		
		System.out.print(" Are you are hungry? 1=yes 0=no");
		a = input.nextInt();
		if(a==1){
			System.out.println(" You got in the line.");
			System.out.print(" Do you have money? 1=yes 0=no");
			a = input.nextInt();
			if(a==1){
				System.out.print(" You bought lunch. ");
				System.out.print(" Are you thirsty? 1=yes 0=no");
				a = input.nextInt();
				if(a==1)
					System.out.println(" You bought a coke to quench your thirst.");
				System.out.println(" You ate your lunch and restored your energy!");
				System.out.println(" You returned your tray.");
				System.out.println(" You left...");
			}
			else
				System.out.println("Broke people can't eat!");
			
		}
		else
			System.out.println("Then I can't help you...begone foul creature!");
		input.close();

	}

}
