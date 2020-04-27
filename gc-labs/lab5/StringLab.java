package lab5;
import java.util.Scanner;
/*
 * @author jilliancenters
 */
public class StringLab {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringMethods methods = new StringMethods();
		
		System.out.println("Welcome to the Official String Genie! [PATENT PENDING]\n\n");
		
		System.out.print("Please enter a phrase that needs proper punctuation: ");
		String properCaps = methods.capitalize(scn.nextLine());
		System.out.println(properCaps + "\n");
		
		System.out.print("Have you seen Waldo? ");
		int hesHere = methods.wheresWaldo(scn.nextLine());
		if(hesHere < 0) {
			System.out.println("I'm not sure where he could be, given that information.\n");
		}else {
			System.out.println("Waldo is behind " + hesHere + " characters, then.\n");
		}
		
		System.out.print("Here, let me alphabetize a couple words for you: ");
		String properOrder = methods.firstThingsFirst(scn.next(), scn.next());
		System.out.println(properOrder + "\n");
		
		System.out.print("Ever wonder what you would sound like if you spoke in Mirror? ");
		String reversePhrase = methods.reverse(scn.nextLine());				//Works in StringMethods(), but for some reason skips through in here.
		System.out.println(reversePhrase + ". Sounds pretty goofy, huh?\n");
		
		System.out.print("What are two things you're having a hard time choosing between?");
		String longestFirst = methods.soLong(scn.next(), scn.next());
		System.out.println("In this context, we'll go with quantity over quality: " + longestFirst + "\n");
		
		System.out.print("Did you know? All that matters is what happens after you do your math: ");
		String importantStuff = methods.afterMath(scn.nextLine());			//Same thing happens here.
		System.out.println(importantStuff + "\nSee? I told you.\n");
		
		System.out.println("Here's a cool party trick. I can take any word and turn it into a sword: ");
		methods.letterize(scn.nextLine());
		System.out.println("\n");
		
		System.out.print("I couldn't figure out how to translate your message to Camel Case, but I did figure out Pascal Case. Would you like to have a go?");
		String pascalTime = methods.pascalCase(scn.nextLine());
		System.out.println("\"" + pascalTime + ".\" How did I do?\n");
		
		System.out.println("Thanks for Playing!");
		
		scn.close();
	}
	
	
	
}