package lab8;
/**
 * @author JillianCenters
 */

import java.util.Scanner;
public class IntroductionGenie {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean playAgain = true;
 		int plays = 0;
		int input;
		String response = "";
		String[] students = {"Andre","Alice","Bruce","Bethany","Camden","Carley","Drew","Diana","Everett","Etta"};
		String[] food = {"cake","sushi","chilli","ice cream","tomato soup","steak","omelette","turkey club sandwich","watermelon","stir fry"};
		String[] hometown = {"Flat Rock, Mi","San Antonio, Tx","Windsor, On","Grand Rapids, Mi","Detroit, Mi","Chicago, Il","Traverse City, Mi","Dearborn, Mi","Tokyo, Jp","Las Vegas, Nv"};
		
		
		while(playAgain) {
			boolean anotherFact = true;
			
			
			
			if(plays == 0){
				System.out.println("Welcome to the Official Introduction Genie! [PATENT PENDING]");
				System.out.print("Who would you like to meet first? Enter a number 1-10: ");
			}else {
				System.out.print("Who would you like to meet next?(1-10) ");
			}
			
			
			do {
			try {
			input = scnr.nextInt();
			System.out.println("\nStudent #" + input + " would be " + students[input - 1] + ".\n");
			break;
			}catch(IndexOutOfBoundsException iob){
				System.out.print("Sorry, enter a whole number between 1 and 10 only: ");
			}
			
			}while(true);
			scnr.nextLine();
			
			
			while(anotherFact) {
			do{
				System.out.print("Would you like to learn about " + students[input - 1] + "'s favorite food, or hometown?");
				response = scnr.nextLine();
				if(response.equalsIgnoreCase("favorite food")||response.equalsIgnoreCase("food")) {
					System.out.println("\n" + students[input - 1] + "'s favorite food is " + food[input -1] + ".");
					break;
				}else if(response.equalsIgnoreCase("hometown")||response.equalsIgnoreCase("home town")||response.equalsIgnoreCase("town")){
					System.out.println("\n" + students[input - 1] + " is from " + hometown[input -1] + ".");
					break;
				}else{
					System.out.println("I'm sorry, I couldn't understand that. ");
				}
			}while(true);
			
				System.out.print("Would you like to learn more about " + students[input - 1] + "? (y/n) ");
				response = scnr.nextLine();
				anotherFact = response.toLowerCase().startsWith("y");
			}
		
			
			System.out.print("Would you like to meet someone else?(y/n) ");
			response = scnr.nextLine();
			playAgain = response .toLowerCase().startsWith("y");
			++plays;
		}
		
		
		System.out.println("Goodbye!");
		scnr.close();
	}
}
