package lab11;
/**
 * 
 * @author JillianCenters
 *
 */
public class Movie {

	private String genre = "";
	private String title = "";
	

//Sets/Gets for each object
	public Movie(String title,String genre) {
		this.title = title;
		this.genre = genre;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGenre() {
		return genre;
	}
	
	
//to String
	@Override
	public String toString() {
		return String.format("%s %s", title,genre);
	}	

}
