package lab17;

import java.util.List;

public class Methods {

	private static FileHelper<Country> fileHelper = new FileHelper<>("src/countries.txt", new CountryLineConverter());		

	
	
	public static void getCommands() {
		System.out.println("|-------------------------------------------------------------------------------|");
		System.out.printf("|%-40s%-5s%-34s|\n","COMMAND","||","ACTION");
		System.out.println("|*******************************************************************************|");
		System.out.printf("|%-40s%-5s%-34s|\n","list","||","To view the Country list");
		System.out.println("|*******************************************************************************|");
		System.out.printf("|%-40s%-5s%-34s|\n","add [COUNTRY NAME,POPULATION-NO-COMMAS]","||","To *honestly* add to our list <3");
		System.out.println("|*******************************************************************************|");
		System.out.printf("|%-40s%-5s%-34s|\n","commands","||","To view this list again");
		System.out.println("|*******************************************************************************|");
		System.out.printf("|%-40s%-5s%-34s|\n","quit","||","To quit");
		System.out.println("|-------------------------------------------------------------------------------|");
	}
	
	
	
	public static void setLine(String userInput) {
		String[] arr = userInput.split(" ");
		String add = arr[1];
		String[] parts = add.split(",");
		String name = parts[0];
		int population = Integer.parseInt(parts[1]);
		fileHelper.append(new Country(name,population));
		System.out.println("Added " + name + " to the file. Thank you for your contribution!");
	}
	
	
	
	public static void getList(FileHelper<Country> fileHelper) {
		List<Country> countries = fileHelper.readAll();
		fileHelper.rewrite(countries);
		for(Country c : countries) {
		fileHelper.rewrite(countries);
			System.out.println(c);
		}
	}
}
