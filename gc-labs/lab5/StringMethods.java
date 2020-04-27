package lab5;
/*
 * @author jilliancenters
 */
public class StringMethods {

	public static void main(String[] args) {
	
		String rev = reverse("Now we're talking in mirror.");
		System.out.println(rev + "\n");
		
		String mathIsAwesome = afterMath("Oh wow, math is so cool!");
		System.out.println(mathIsAwesome);
		
	}
	public static String capitalize(String word) { 
		String properCaps = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
		return properCaps;
	}
	public static int wheresWaldo(String phrase) {
		int hesHere = phrase.indexOf("Waldo");
		return hesHere;
	}
	public static String firstThingsFirst(String a, String b) {
		int comparison = a.compareToIgnoreCase(b);
		String properOrder = "";
		boolean order = comparison <=0;
		
		if(order) {
			properOrder = a + "\n" + b;
		}else {
			properOrder = b + "\n" + a;
		}
		return properOrder;
	}
	public static String reverse(String s) {
		String reversePhrase = "";
		for(int i = s.length() - 1; i >= 0; i--) {
			reversePhrase += s.charAt(i);
		}
		return reversePhrase;
	}
	public static String soLong(String a, String b) {
		int difference = a.length() - b.length();
		boolean equalsCheck = (difference == 0);
		String longestFirst = "";
		
		if(difference > 0) {
			longestFirst = a;
		}else if (difference < 0){
			longestFirst = b;		
		}else if (equalsCheck){
			longestFirst = a + "\n" + b;
		}
		return longestFirst;
	}
	public static String afterMath(String phrase) {
		int mathematical = phrase.toLowerCase().indexOf("math");
		String importantStuff = "";
		if(mathematical >= 0) {
			String[] newPhrase = phrase.split("math");
			importantStuff = "math" + newPhrase[1];
		}else {
			importantStuff = "dud";
		}
		return importantStuff;
	}
	public static void letterize(String word) {
		for(int i = word.length() - word.length(); i <= word.length() - 1 ; i++) {
			System.out.println(word.charAt(i));
		}
	}
	//leave first one out, and out of the loop
	public static String pascalCase(String phrase) {
		phrase.toLowerCase();
		String pascalTime = "";
			String[] pascal = phrase.split(" ");
			for (String s : pascal) {
				pascalTime += (s.substring(0,1).toUpperCase()) + (s.substring(1).toLowerCase());
			}
		
		return pascalTime;
	}

}
