package lab17;

import java.util.*;

public class Validator {



//GET AN INTEGER
	public static int getInt(Scanner scnr, String prompt) {
		while (!scnr.hasNextInt()) {
			scnr.nextLine(); 
			System.out.println(prompt);
		}
		int result = scnr.nextInt();
		scnr.nextLine(); 
		return result;
	}

	
	
//GET A STRING
	public static String getString(Scanner scnr, String prompt) {
	System.out.print(prompt);
		return scnr.nextLine();
	}


//GET CORRECT COMMAND
	public static String getCommand(Scanner scnr,String prompt) {
		String input = "";
		String addRegex = "[ADDadd]{3}\\s[A-Za-z]+,[0-9]+";
		do {
			input = getString(scnr, "");
			if(input.equalsIgnoreCase("LIST")||input.matches(addRegex)||input.equalsIgnoreCase("QUIT")||input.equalsIgnoreCase("COMMANDS")) {
				break;
			}else {
				System.out.println("\nPlease enter one of the commands listed above\n");
				continue;
			}
			
		}while(true);
		
		return input;
	}

	
	

//GET YES OR NO
	public static String getYesNo(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		System.out.println(prompt);
		do {
			input = getString(scnr,"");

			if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")){
				isValid = true;
			} else {
				System.out.print("\nPlease enter \"YES\" or \"NO\". ");
				isValid = false;
			}

		} while (!isValid);
		
		return input;
	}
	
}