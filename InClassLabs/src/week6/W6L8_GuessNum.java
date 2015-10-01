package week6;

import java.util.Scanner;

public class W6L8_GuessNum {

	public static void main(String[] args) {
		int rand, userNum;
		String tBig="Sorry, the number you guessed is too big. ";
		String tSmall="Sorry, the number you guessed is too small. ";
		String uString;
		Scanner input = new Scanner(System.in);
		
		//Start	
		System.out.print("I have a number inbetween 1 & 10, "
		+ "can you guess what it is? ");
		rand = 1+(int)(Math.random()*10);
		System.out.print(rand);
		do
		{
			System.out.print("Guess... ");
			userNum=input.nextInt();
			if(userNum > 10 || userNum < 1){
				System.out.printf("The number %d is out of the valid range!", 
						userNum);
			}
			else{
				if(userNum==rand)
					System.out.printf("Congratz, you guessed correctly!\n");
				else{
					uString =(userNum > rand)? tBig:tSmall;
					System.out.printf("%s\n",uString);
				}			
			}
		}
		while(userNum != rand);
		
		input.close();
	}
}

