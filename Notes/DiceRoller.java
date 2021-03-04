import java.util.Random;
import java.util.Scanner;
/*
 * Gregory Yao
 * 5 November 2018
 */
public class DiceRoller {

	private int max;
	private int num;
	private int sides;

	private void reset() {
		max = 0;
	}
	
	private void roll() {
		Random r = new Random((int)(Math.random() * 100));
		
		num = r.nextInt(max + 1);
		if(num == 0)
			roll();
		else if(sides == 2)
			System.out.println("The coin landed on face " + num);
		else
			System.out.println("The dice rolled a " + num);
	}
	
	private boolean replay(){
		System.out.println("Would you like to roll again? (Y/N)");
		Scanner s = new Scanner(System.in);
		
		while( true ){
			String answer = s.nextLine();
			if( answer.equals("Y") || answer.equals("y"))
				return true;
			else if( answer.equals("N") || answer.equals("n"))
				return false;
			else
				System.out.println("Please enter Y or N.");
		}
	}
	
	private void userInput() {
		boolean isValid = true;
		
		System.out.println("How many sides are on the dice you'd like to roll?");
		while(isValid) {
			Scanner answer = new Scanner(System.in);
			if(answer.hasNextInt()) {
				sides = answer.nextInt();
				if(sides > 1) {
					max = sides;
					isValid = false;
				}
				else
					System.out.println("The dice cannot be rolled, it's a " + sides + " sided dice... \r" +
							"Let's try again with a number greater than 1?");
			}
			else {
				System.out.println("How do you have a dice with " + answer.nextLine() + " sides? \r" +
						"Let's try this again...");
				isValid = true;
			}
		}
	}
	
	private void start(){
		System.out.println("Welcome to the dice rolling class, DiceRoller!" + "\n");
		boolean rollAgain = true;
		while(rollAgain) {
			userInput();
			roll();
			rollAgain = replay();
			reset();
		}
	}
	
	public static void main(String[] args) {
		DiceRoller d = new DiceRoller();
		d.start();
	}
}
