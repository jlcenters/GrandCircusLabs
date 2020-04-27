package lab6;

import java.util.Scanner;

/*
 * @authors Jeannie Jillian
 */
public class DiceRoll {

	public static void main(String[] args) {
		System.out.println("Welcome to the Official Die Roll Game! [PATENT PENDING]\n");
		boolean rollAgain = true;
		Scanner scn = new Scanner(System.in);
		int i = 1;

		
		
		
		while(rollAgain) {
			System.out.println("\nHow many sides are on your dice?");
			int numSides = scn.nextInt();
			System.out.println("Your dice roll results: ");
			int roll1 = DiceMethods.generateRandomDieRoll(numSides);
			int roll2 = DiceMethods.generateRandomDieRoll(numSides); 
			System.out.println(roll1 + "\n" + roll2);
			
			
			
			if(numSides == 6) {
				System.out.println(DiceMethods.rollCheck(roll1, roll2, i));
				++i;
			}else {
				System.out.println("You rolled a " + (roll1 + roll2));
				++i;
			}
			
			System.out.println("Do you want to roll again? (y/n)");
			rollAgain = scn.next().toLowerCase().startsWith("y");
		}
		
		
		
		System.out.println("\nGoodbye!");
		scn.close();
	}

}
