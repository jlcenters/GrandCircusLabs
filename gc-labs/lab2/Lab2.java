package lab2;

import java.util.Scanner;
/*
 * @author jilliancenters
 */
public class Lab2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Official Grand Circus Room Detail Generator! [PATENT PENDING]");
		
		double length;
		double width;
		double height;
	
		System.out.println("Please enter the following data:");
		System.out.print("Length: ");
		length = scnr.nextDouble();
		System.out.print("Width: ");
		width = scnr.nextDouble();
		System.out.print("Height: ");
		height = scnr.nextDouble();
		
		System.out.println("Area: " + (length * width));
		System.out.println("Perimeter: " + ((length + width) * 2));
		System.out.println("Volume: " + (length * width * height));
		
		
			System.out.println("Goodbye.");
		scnr.close();
	}
}
