package week6;

import java.util.Scanner;

public class W6L3b {

	public static void main(String[] args) {
		int rand, userNum;
		int min=1, max=10;
		String tBig="Sorry, the number you guessed is too big. ";
		String tSmall="Sorry, the number you guessed is too small. ";
		String uString;
		Scanner input = new Scanner(System.in);
				
		System.out.print("I have a number inbetween 1 & 10, "
				+ "can you guess what it is? ");
		rand = min+(int)(Math.random()*max);
		//System.out.print(rand);
		userNum=input.nextInt();
		if(userNum > max || userNum < min){
			System.out.printf("The number %d is out of the valid range!", 
					userNum);
		}
		else{
			if(userNum==rand)
				System.out.printf("Congratz, you guessed correctly!");
			else{
				uString =(userNum > rand)? tBig:tSmall;
				System.out.printf("%s\nThe correct number was %d.", 
						uString ,rand);
			}			
		}
			input.close();
	}
}

