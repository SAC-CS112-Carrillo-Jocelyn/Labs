package week5;

import java.util.Scanner;

public class W5L2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int thirsty;
		
		System.out.print(" You are hungry.");
		System.out.println(" You got in the line.");
		System.out.print(" You bought lunch. ");
		System.out.print(" Are you thirsty? 1=yes 0=no");
		thirsty = input.nextInt();
		if(thirsty==1)
			System.out.println(" You bought a coke to quench your thirst.");
		else
			System.out.println(" Here have some water. Don't want you to choke");
			
		System.out.println(" You ate your lunch and restored your energy!");
		System.out.println(" You returned your tray.");
		System.out.println(" You left...");
		
		input.close();

	}

}
