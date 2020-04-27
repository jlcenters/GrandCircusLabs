package roshambolab;
import java.util.*;
/**
 * 
 * @author JillianCenters
 *
 */
public class RoshamboApp {

	public static void main(String[] args) {
		
		boolean playAgain = false;
		boolean correctChoice = true;
		Scanner scnr = new Scanner(System.in);
		String userChoice;
//INSTANTIATE PLAYERS AND ADD TO MAP
		Map<Integer, Player> players = new HashMap<>();
		Player jerome = new RockSelector("Jerome", "loves the beach", 10, 0);
		Player tristen = new RockSelector("Tristen", "is cold and calculating", 7, 3);
		Player sadie = new RockSelector("Sadie", "collects rocks", 2, 8);
		Player brent = new RockSelector("Brent", "is afraid of paper", 5, 5);
		Player taylor = new RandomSelector("Taylor", "doesn't like the snow", 0, 10);
		Player jenny = new RandomSelector("Jenny", "reads in her free time", 6, 4);
		Player tearra = new RandomSelector("Tearra", "loves to bake", 9, 1);
		Player rick = new RandomSelector("Rick", "likes to call himself a wildcard", 5, 5);
		players.put(1,jerome);
		players.put(2, brent);
		players.put(3, taylor);
		players.put(4, tearra);
		players.put(5, tristen);
		players.put(6, jenny);
		players.put(7, sadie);
		players.put(8, rick);
		

//GET USER NAME AND INSTANTIATE PLAYER
		System.out.print("Please enter your name: ");
		userChoice = scnr.nextLine();
		System.out.println("\n\nWelcome, " + userChoice + ", to the Official Rock Paper Scissors Tournament! [PATENT PENDING]");
		Player user = new UserSelector(userChoice, "", 0, 0);
//SELECT OPPONENT
		do {
		System.out.println("\nPlease select a Rival!");
		int userNum = 0;
		
		do {
			System.out.println("\n\n" + user.toString()+ "\n");
			System.out.println("***************************************************");
				System.out.println(String.format("%-20s%-24s%s", "|#|","RIVAL","|W/L|"));
				System.out.println("**************************************************|");
				for(int i = 1; i <= players.size(); ++i) {
					System.out.printf("%-4s%-40s%s","|" + i + "|",players.get(i).getName() + " " + players.get(i).getDescription() + ":", "|" + players.get(i).getWins() + "/" + players.get(i).getLosses() + "|\n");
					System.out.println("**************************************************|");
				}
				userNum = Validator.getMenuNum(scnr, "Please enter a number: ", 1, 8);
//CONFIRM OPPONENT
				correctChoice = Validator.getYesNo(scnr, "Would you like to play against " + players.get(userNum).getName() + "?").toLowerCase().startsWith("y");
		}while(!correctChoice);

//RPS
		do {
			System.out.println("\nROCK!");
			scnr.nextLine();
			System.out.println("PAPER!");
			scnr.nextLine();
			System.out.println("SCISSORS!\n");
			user.generateRoShamBo();
			System.out.println("\nSHOOT!\n");
			scnr.nextLine();
			System.out.println(user.getName() + " throws " + user.getRps() + "!");
			scnr.nextLine();
			players.get(userNum).generateRoShamBo();
			System.out.println(players.get(userNum) + " throws " + players.get(userNum).getRps() + "!");
			scnr.nextLine();
			if(user.getRps().equals(players.get(userNum).getRps())) {
				System.out.println("DRAW!");
				continue;
			}else if((user.getRps().equals(Roshambo.ROCK) && players.get(userNum).getRps().equals(Roshambo.SCISSORS)) || (user.getRps().equals(Roshambo.SCISSORS) && players.get(userNum).getRps().equals(Roshambo.PAPER)) || (user.getRps().equals(Roshambo.PAPER) && players.get(userNum).getRps().equals(Roshambo.ROCK))){ 
				System.out.println(user.getName() + " Wins!\n");
				user.setWins(1);
				players.get(userNum).setLosses(1);
				break;
			}else {
				System.out.println(players.get(userNum).getName() + " Wins!\n");
				user.setLosses(1);
				players.get(userNum).setWins(1);
				break;
			}
		}while(true);
		
		
//PLAY AGAIN	
			System.out.println("You currently have " + user.getWins() + " wins and " + user.getLosses() + " losses this play session.");
			playAgain = Validator.getYesNo(scnr, "Would you like to play again? ").toLowerCase().startsWith("y");
		}while(playAgain);
		System.out.println("Goodbye!\n");
		scnr.close();
	}

}
