package lab6;
/*
 * @authors Jeannie Jillian
 */
import java.util.*;
public class DiceMethods {

	
	
	public static int generateRandomDieRoll(int numSides) {
		
		Random randNum = new Random();
		
		//int rollResult = (int)(Math.random() * numSides) + 1;	MATH.RANDOM
		int rollResult = (randNum.nextInt(numSides) + 1);
		
		return rollResult;
	}
	
	
	
	public static String rollCheck(int roll1, int roll2, int i) {
			if ((roll1 == 1 && roll2 == 1) && i > 1) {
				return "You rolled Snake Eyes!";
				
				}else if((roll1 == 6 && roll2 == 6) && i > 1) {
					return "You rolled Box Cars!";
					
			}else if((roll1 + roll2 == 2 || roll1 + roll2 == 3 || roll1 + roll2 == 12) && i == 1) {
				return "You're Crapping Out!";
			}else  {
				return "";
			}
	}
	
	
	
}
	

