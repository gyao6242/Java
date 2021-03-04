/* Figure out the functionality of this class.
 * Change the output to be meaningful.
 * Give the variables names appropriate to their usage.
 */

import java.util.Random;
import java.util.Scanner;

public class Mystery {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Guess My Number!");
		int num;
		int maxNum = 1000;
		boolean replay = true;
		int submitNum;
		Scanner e = new Scanner(System.in);
		Random f = new Random((int)(Math.random()*100));
		
		while(replay){
			num = f.nextInt(maxNum+1);
			boolean numFound = false;
			for(int i = 0; i < 10 && !numFound; i++){
				do{
					System.out.println("The number is between 0 and  " + maxNum);
					submitNum = e.nextInt();
					if(submitNum < 0 || submitNum > maxNum)
						System.out.println("Try guessing between 0 and 1000, silly");
				}while(submitNum < 0 || submitNum > maxNum);
				if(submitNum == num){
					System.out.println("That's my number!");
					numFound = true;
				}
				else{
					if(submitNum < num)
						System.out.println("Think higher numbers!");	
					else
						System.out.println("Think lower buddy!");
				}
			}
			
			if(!numFound){
				System.out.println("Nice Try");
				System.out.println("My number is " + num);
			}
			
			System.out.println("Play again?");
			String playAgain;
			while( true ){
				playAgain = e.nextLine();
				if( playAgain.equalsIgnoreCase("y")|| playAgain.equalsIgnoreCase("n"))
					break;
				System.out.println("Press 'y' to play again, or 'n' to exit");
			}
			
			if(playAgain.equalsIgnoreCase("n"))
				replay = false;
		}
	}
}
