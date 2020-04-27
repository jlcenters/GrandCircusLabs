package lab17;

import java.util.*;

public class Countries {

	private static FileHelper<Country> fileHelper = new FileHelper<>("src/countries.txt", new CountryLineConverter());		
	
	
	public static void main(String[] args) {
		String userInput = "";
		Scanner scnr = new Scanner(System.in);
		fileHelper.rewrite(Arrays.asList(new Country("United States",327200000),
				new Country("Italy",60480000)));
		fileHelper.append(new Country("Vatican City",1000));
		
		
		
//START
		System.out.println("Welcome to the Official Country Population List!");
		scnr.nextLine();
		System.out.println("We pride ourselves in being an Open-Source List Provider, so any updates are more than welcome!\n");
	
		
		
//PRINT OUT COMMAND LIST
		Methods.getCommands();
		
		
		
//GET USER INPUT
		do {
			userInput = Validator.getCommand(scnr, "Please enter your command now: ");
//PERFORM METHODS
			if(userInput.equalsIgnoreCase("LIST")) {
				Methods.getList(fileHelper);
				continue;
			}else if(userInput.equalsIgnoreCase("COMMANDS")) {
				Methods.getCommands();
				continue;
			}else if(userInput.equalsIgnoreCase("QUIT")) {
				break;
			}else {
				Methods.setLine(userInput);	
				continue;	
			}
		}while(true);
		
//STOP
		System.out.println("Goodbye!");
	}
}
