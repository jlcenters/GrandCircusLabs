package lab12;

import java.util.*;

public class Lab12Part2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean doNotWant;
		int choiceIndex = 0;
		Car tes = new Car("Tesla","Model Y",2020,50000.00);
		Car sub = new Car("Subaru","WRX",2020,30000.00);
		Car frd = new Car("Ford","Fusion",2020,25000.00);
		
		UsedCar toy = new UsedCar("Toyota","RAV4",2015,15000.00,38000.00);
		UsedCar chevy = new UsedCar("Chevrolet","Equinox",2016,10000.00,55000.00);
		UsedCar hyu = new UsedCar("Hyundai","Veloster",2013,10000.00,90000.00);
		
		
		
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(tes);
		cars.add(sub);
		cars.add(frd);
		cars.add(toy);
		cars.add(chevy);
		cars.add(hyu);
		

		System.out.println("Welcome to the Official New and Used Car Dealer Room! [PATENT PENDING]\n");
		do {
		//PRINTS OUT LISTING
			System.out.println("|---------------------------------------------------------------------*");
			for(Car c : cars) {
				System.out.println("| " + c);
				System.out.println("|---------------------------------------------------------------------*");
			}
			System.out.println("\n");
			String userInput = Validator.getModel(scnr, "Please select a model to purchase: ");
			
			
			
		//PRINTS OUT CHOICE
			for(int i = 0; i < cars.size(); ++i) {
				if(userInput.equalsIgnoreCase(cars.get(i).getModel())) {
					System.out.println("\n-" + cars.get(i));
					choiceIndex = i;
				}else {
					continue;
				}
			}
			
			doNotWant = Validator.getYesNo(scnr, "\nIs this the car you'd like to buy? ").toLowerCase().startsWith("n");
		}while(doNotWant);
		
		
	//REMOVES CHOICE AND PRINTS OUT NEW LISTING
		System.out.println("|---------------------------------------------------------------------*");
		cars.remove(choiceIndex);
		for(Car c : cars) {
			System.out.println("| " + c);
			System.out.println("|---------------------------------------------------------------------*");
		}
		
		
		
		System.out.println("\nThank you for shopping with us! One of our sales representatives will be with you shortly.");
		
		
	}

}
