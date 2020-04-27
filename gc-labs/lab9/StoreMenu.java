package lab9;
/**
 * @author JillianCenters
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StoreMenu {

	public static void main(String[] args) {
		boolean goAgain = true;
		double avg = 0.00;
		double sum = 0.00;
		int count = 0;
		Integer userQuant = 0;
		Scanner scnr = new Scanner(System.in);
		String userChoice = "";
		
	//INVENTORY
		HashMap<String, Double> items = new HashMap<>();
		items.put("Spinach",0.99);
		items.put("Carrots",1.00);
		items.put("Bananas",1.50);			//put maps and arrays into methods for a cleaner main
		items.put("Apples",1.75);
		items.put("Broccoli",1.99);
		items.put("Blueberries",3.99);
		items.put("Cheese",4.99);
		items.put("Ground Turkey",2.99);
		items.put("Deli Meat",6.99);
		items.put("Whole Chicken",10.00);

	//USER CHOICES
		ArrayList<String> choice = new ArrayList<>(); //add each item
		ArrayList<Integer> amount = new ArrayList<>();	//add quant of each item
		ArrayList<Double> cost = new ArrayList<>();	//add price of item
			
			
	

		//DISPLAY INVENTORY MENU
			System.out.println("Welcome to Guenther's Official Food Dispenser! [PATENT PENDING]\nHere is a list of what we have:\n");
			System.out.printf("%8s","ITEM	 	||");
			System.out.println("PRICE");
			System.out.print("=========================\n");
			for(String key : items.keySet()){
				System.out.printf("%-16s",key);
				System.out.printf("%-3s","||$");
				System.out.printf("%5.2f\n", items.get(key));
			}

			
			
	//ITEM LOOP
		while(goAgain) {
		//PROMPT FOR ITEM
			System.out.print("\nWhat would you like to order? ");
			userChoice = checkKey(userChoice, items, scnr);
			choice.add(userChoice);
			cost.add(items.get(userChoice));
				
				
				
		//PROMPT FOR QUANTITY
			if(userChoice.endsWith("s")) {
				System.out.print("How many " + userChoice + "($");
				System.out.printf("%.2f", items.get(userChoice));
			System.out.print(" each) would you like? Please enter a number 1-9: ");
			}else {
				System.out.print("How much " + userChoice + "($");
				System.out.printf("%.2f", items.get(userChoice));
				System.out.print(" each) would you like? Please enter a number 1-9: ");				
			}
			userQuant = checkQuant(userQuant, scnr);
			amount.add(userQuant);
			scnr.nextLine();
			System.out.println("\nAdding " + userQuant + " " + userChoice + " to your order.");
				

				
		//ASK FOR ANOTHER ITEM
			System.out.print("Would you like to order another item?(y/n): ");
			goAgain = checkYesNo(userChoice, goAgain, scnr);	
		}
			
			
			
	//GET AVERAGE
		for(int i = 0; i > amount.size(); ++i) {
			sum += ((double)amount.get(i) + (double)cost.get(i));	//TRY ENHANCED LOOP FOR AVG W/ARRAYS
		}
		avg = (sum / amount.size());
			
			
			
	//PRINT OUT RESULTS
		System.out.print("==========================\n");
		for(String s : choice) {
			System.out.printf("%-16s",s);
			System.out.printf("%d %-1s",amount.get(count),"@ $");
			System.out.printf("%5.2f\n", cost.get(count));
			++count;
		}
		System.out.print("==========================\n");
		System.out.printf("%-17s %2s %-5.2f\n","Total:","$",sum);
		
		
		System.out.println("Your average cost was " + avg + " per item.");
		System.out.println("Goodbye, and thank you for shopping with us!");
	scnr.close();	
	}
	
	
	
//CHECK FOR PROPER QUANTITY INPUT
	public static Integer checkQuant(Integer userQuant, Scanner scnr) {
		do{
			userQuant = (Integer)scnr.nextInt();
			if(userQuant <= 9 && userQuant > 0) {
				return userQuant;
			}else {
				System.out.print("I'm sorry, I couldn't understand that. Please enter a whole number 1-9.");
			}	
		}while(true);
	}
	
	
	
//CHECK FOR PROPER KEY INPUT
	public static String checkKey(String userChoice, HashMap<String,Double> items, Scanner scnr) {
		do {
			userChoice = scnr.nextLine();
			if(items.containsKey(userChoice)) {
				return userChoice;
			}else {
				System.out.print("I'm sorry, I couldn't understand that. Please enter from our list: ");
			}
		}while(true);
	}
	
	
	
//CHECK YES OR NO QUESTIONS	
	public static boolean checkYesNo(String userChoice, boolean goAgain, Scanner scnr) {
		do {
			userChoice = scnr.nextLine();
			if(userChoice.toLowerCase().startsWith("y") || userChoice.toLowerCase().startsWith("n")) {
				goAgain = userChoice.toLowerCase().startsWith("y");

				if(goAgain) {
					return true;
				}else if(!goAgain) {
					return false;
				}
			}else {
				System.out.print("I'm sorry, I couldn't understand that. Please enter \"Yes\" or \"No\": ");
			}
		}while(true);
	}

}
