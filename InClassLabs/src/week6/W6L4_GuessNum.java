package week6;

import java.util.Scanner;

public class W6L4_GuessNum {

	public static void main(String[] args) {
		int rand, userNum, loopNum=1;
		String tBig="Sorry, the number you guessed is too big. ";
		String tSmall="Sorry, the number you guessed is too small. ";
		String uString;
		Scanner input = new Scanner(System.in);
		
		//Start		
		while(loopNum<=3){
		
			System.out.print("I have a number inbetween 1 & 10, "
			+ "can you guess what it is? ");
			rand = 1+(int)(Math.random()*10);
			//System.out.print(rand);
			userNum=input.nextInt();
			
			if(userNum > 10 || userNum < 1){
				System.out.printf("The number %d is out of the valid range!", 
						userNum);
			}
			else{
				loopNum++; //adds 1 to loopNum 
						   //only if user enters a valid number
				if(userNum==rand)
					System.out.printf("Congratz, you guessed correctly!\n");
				else{
					uString =(userNum > rand)? tBig:tSmall;
					System.out.printf("%s\nThe correct number was %d.\n", 
							uString ,rand);
				}			
			}
		}
		input.close();
			
	}

}


