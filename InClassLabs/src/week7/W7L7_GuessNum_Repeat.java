package week7;

import java.util.Scanner;

public class W7L7_GuessNum_Repeat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String tBig="Sorry, the number you guessed is too big. ";
		String tSmall="Sorry, the number you guessed is too small. ";
		String uString;
		int rand, userNum;
		char playAgain ='y';
		boolean valid; //User give valid input for PlayAgain?
		
		//Start		
		do
		{
			System.out.print("I have a number inbetween 1 & 10, "
			+ "can you guess what it is? ");
			rand = 1+(int)(Math.random()*10);
			//System.out.print(rand);
			userNum=input.nextInt();
			
			if(userNum > 10 || userNum < 1){
				System.out.printf("The number %d is out of the valid range!\n", 
						userNum);
			}
			else{
				if(userNum==rand)
					System.out.printf("Congratz, you guessed correctly!\n");
				else{
					uString =(userNum > rand)? tBig:tSmall;
					System.out.printf("%s\nThe correct number was %d.\n", 
							uString ,rand);
				}			
			}
			
			//Will keep looping until player enters a valid response.
			// being N/n/Y/y
			valid=false;
			while(!valid)
		 	{
				System.out.printf("Play Again? Y=Yes N=No ");
				playAgain = input.next().charAt(0);
				if(playAgain == 'n'|| playAgain == 'N' 
					|| playAgain =='y'|| playAgain =='Y')
					valid =true;
		 	}
			
		}
		while(playAgain == 'y'|| playAgain =='Y');
		
		input.close();
			

	}

}
