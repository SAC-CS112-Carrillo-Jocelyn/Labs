package week7;

import java.util.Scanner;

public class W7L6_GuessNum_DoWhile3 {

	public static void main(String[] args) {
		int rand, userNum, loopNum=1;
		String tBig="Sorry, the number you guessed is too big. ";
		String tSmall="Sorry, the number you guessed is too small. ";
		String uString;
		Scanner input = new Scanner(System.in);
		
		//Start		
		do
		{
			System.out.print("I have a number inbetween 1 & 10, "
			+ "can you guess what it is? ");
			//create & store random#
			rand = 1+(int)(Math.random()*10);
			//store user#
			userNum=input.nextInt();
			
			//A check to make sure user entered a # inbetween 1 & 10
			if(userNum > 10 || userNum < 1){
				System.out.printf("The number %d is out of the valid range!", 
						userNum);
			}
			//Logic to check user# & random# 
			else{
				loopNum++; //adds 1 to loopNum only if user enters a valid number
				if(userNum==rand)
					System.out.printf("Congratz, you guessed correctly!\n");
				else{
					uString =(userNum > rand)? tBig:tSmall;
					System.out.printf("%s\nThe correct number was %d.\n", 
							uString ,rand);
				}			
			}
		}
		while(loopNum<=3);//User will play the game 3times
		
		input.close();
	}

}
