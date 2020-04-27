package lab12;

import java.util.*;

public class CarApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean anotherCar;
		int userAmount;
		int userYear;
		double userPrice;
		String userMake = "";
		String userModel = "";
		String userInput = "";
		ArrayList<Car> cars = new ArrayList<>();
		try {
			do {
				System.out.print("How many cars would you like to list today?");
				userAmount = scnr.nextInt();
				for(int i = 1; i <= userAmount; ++i) {
					scnr.nextLine();
					System.out.print("\nWhat's the make for car " + i + "?");
					userMake = scnr.nextLine();
					System.out.print("\nWhat's the model?");
					userModel = scnr.nextLine();
					System.out.print("\nWhat's the year?");
					userYear = scnr.nextInt();
					System.out.print("\nWhat's the price? ");
					userPrice = scnr.nextDouble();
					
					Car car = new Car(userMake,userModel,userYear,userPrice);
					cars.add(car);
					
	
				}
				scnr.nextLine();
				for(Car c : cars) {
				System.out.println(c);
				}
				
				System.out.print("\nAre you interested in listing more cars?(y/n) ");
				userInput = scnr.nextLine();
				anotherCar = userInput.toLowerCase().startsWith("y");
			
			}while(anotherCar);
		}catch(InputMismatchException im) {
			System.out.println("\nNumbers and decimal points only, please!");
		}
		
		System.out.print("\n\nGoodbye!");
		scnr.close();
	}

}
