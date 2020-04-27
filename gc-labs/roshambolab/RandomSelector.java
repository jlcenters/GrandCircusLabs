package roshambolab;
import java.util.*;
public class RandomSelector extends Player {

	public RandomSelector(String name,String description,int wins, int losses) {
		super(name,description, wins, losses);
		}
	
	@Override
	public String toString() {
		return String.format("%s", name);
	}
	@Override
	public void generateRoShamBo() {
		Random roshambo = new Random();	
		int upperbound = 9;
		int rand = roshambo.nextInt(upperbound);
		if((rand >= 0) && (rand <= 2)) {
			this.rps = Roshambo.ROCK;
		}else if((rand >= 3) && (rand <= 5)) {
			this.rps = Roshambo.PAPER;
		}else {
			this.rps = Roshambo.SCISSORS;
		}
	}

}
