package lab4;
/*
 * @author jilliancenters
 */
import java.util.Scanner;
public class Lab4 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInt;
		boolean tryAgain = true;
		
		System.out.println("Welcome to the Official Powers Game! [PATENT PENDING] \n");
		while(tryAgain) {
			System.out.print("Please enter an integer: ");
			userInt = scnr.nextInt();
			System.out.printf("%-10s %-10s %-10s\n", "\nNumber", "Squared", "Cubed");
			System.out.printf("%-9s %-10s %-9s\n", "======", "=======", "======");
			for(int i = 1; i <= userInt; i++) {
				System.out.printf("%-10d", i);
				System.out.printf("%-11d", i * i);
				System.out.printf("%-10d", i * i * i);
				System.out.print("\n");
			}
			System.out.print("Would you like to try another number? (y/n)");
			tryAgain = scnr.next().startsWith("y");
		}
		
		System.out.println("Have a nice day!");
		scnr.close();
	}
	
	

}
