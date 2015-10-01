package week6;
import java.util.Scanner;
public class W6L2_GuessNum {

	public static void main(String[] args) {
		int rand;
		int userNum;
		Scanner input = new Scanner(System.in);
				
		System.out.print("I have a number inbetween 1 & 10, can you guess what it is? ");
		rand = 1+(int)(Math.random()*10);
		userNum=input.nextInt();
		if(userNum==rand)
			System.out.printf("Congratz, you guessed correctly!");
		else {
			if(userNum > rand)
				System.out.printf("Sorry, the number you guessed is too big.\nThe correct number was %d.", rand);
			else 
			System.out.printf("Sorry, the number you guessed is too small.\nThe correct number was %d.",rand);	
		}
		input.close();

	}

}
