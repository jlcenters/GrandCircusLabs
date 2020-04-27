package lab3;
/*
 * @jilliancenters
 */
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInt;
		System.out.println("Welcome to the Odds and Evens Game! [PATENT PENDING]");
		System.out.print("Please enter a number between 1 and 100: ");
		userInt = scnr.nextInt();
		
		if(userInt >= 1 && userInt <= 100) {
			if(userInt % 2 == 1) {
				if(userInt <= 60)
					System.out.println(userInt + " Odd.");
				else 
					System.out.println(userInt + " Odd and over 60.");
			
			} else if(userInt % 2 == 0) {
				if(userInt < 25)
					System.out.println("Even and less than 25.");
				else if(userInt >= 26 && userInt <= 60) 
					System.out.println("Even.");
				else
					System.out.println(userInt + " Even.");
				}
		}else 
			System.out.println("That's the wrong number!");
		
		System.out.println("Thanks for playing!");
		
		scnr.close();
	}

}
