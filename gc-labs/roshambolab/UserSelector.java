package roshambolab;
import java.util.*;
public class UserSelector extends Player {

	public UserSelector(String name,String description,int wins,int losses) {
		super(name,description, wins, losses);
		this.description = "";
	}
	
	public String setChoice() {
		Scanner scnr = new Scanner(System.in);
		String userInput = Validator.getRoShamBo(scnr, "Please enter your choice now: ");
		return userInput;
	}
	
	@Override
	public String toString() {
		return String.format("%s:	WINS(%d)LOSSES(%d)", name,wins,losses);
	}
	@Override
	public void generateRoShamBo() {
		String userInput = setChoice();
		
		if(userInput.equalsIgnoreCase("Rock")) {
			this.rps = Roshambo.ROCK;
		}else if(userInput.equalsIgnoreCase("Paper")) {
			this.rps = Roshambo.PAPER;
		}else {
			this.rps = Roshambo.SCISSORS;
		}
		
	}

}
