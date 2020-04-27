package lab11;
/**
 * 
 * @author JillianCenters
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MovieDecider {

	public static void main(String[] args) {
		//print out menu
		//get userNum
		//ask to continue
		Scanner scnr = new Scanner(System.in);
		boolean playAgain = true;
		String genres = "Scifi,Animated,Musical,Drama,Horror,Comedy,";
		
		
		System.out.println("Welcome to the Official Movie List Generator! [PATENT PENDING]");

		while(playAgain){	
		//PRINTS MOVIE MENU
			ArrayList<String> arrGenres = getMenu(genres);
			
			int userNum = Validator.getInt(scnr, "Please pick a number [1-" + arrGenres.size() + "]", 1, 5);
			System.out.println(getMovies(userNum, arrGenres));
			
		//PLAY AGAIN PROMPT	
			System.out.print("Would you like to check another genre? y/n");
			playAgain = scnr.nextLine().toLowerCase().startsWith("y");
		}
		System.out.println("Goodbye!");
		scnr.close();
	}
	
	
	
	//makes an ArrayList of movies based on the genre selected
		public static ArrayList<Movie> getMovies(int userNum, ArrayList<String> arrGenres) {
			ArrayList<Movie> movieList = new ArrayList<>();
			ArrayList<Movie> allMovies = allMovies();
			String userNumb = "" + userNum + "";
			for(int i = 0; i < 10; ++i) {
				if(arrGenres.contains(userNumb)) {
					arrGenres.remove(userNumb);
					movieList.add(allMovies.get(userNum));
				}else {
				}
			}
			
			return movieList;
		}
		
	//makes an ArrayList out of all the movies
		public static ArrayList<Movie> allMovies(){
			ArrayList<Movie> allMovies = new ArrayList<>();
			for(int i = 0; i <= 100; ++i) {
				allMovies.add(MovieIO.getMovie(i));
			}
			return allMovies;
		}
			
		
	//makes an ArrayList out of the listed genres, separated by a comma
		public static ArrayList<String> getMenu(String genres){	
			String[] arr = genres.split(",");
			ArrayList<String> arrGenres = new ArrayList<>();
			System.out.println("\n==============================================================");

			for(int i = 1; i < arr.length; ++i) {
				arrGenres.add(i + arr[i-1]);
				System.out.print(i + "." + arr[i-1] + "*||*");
			}
			System.out.println("|\n==============================================================");
			return arrGenres;
		}

}
