package co.grandcircus.lab26;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

	@Autowired
	private MoviesDao mrepo;

	private EntityManager em;

	@GetMapping("/movies")
	public List<Movies> allMovies() {
		return new ArrayList<>(mrepo.findAll());
	}

	@GetMapping("/movies/{id}")
	public Movies oneMovie(@PathVariable("id") Long id) {
		return mrepo.findById(id).orElse(null);
	}

	@RequestMapping("/movies")
	public List<Movies> allMoviesByGenre(@RequestParam(value = "genre", required = false) String genre) {
		return mrepo.findByGenreContainingIgnoreCaseOrderByGenre(genre);
	}

	@GetMapping("/movies/random")
	public Movies oneRandomMovie() {
		List<Movies> movies = mrepo.findAll();
		Random r = new Random();
		int rNum = r.nextInt(movies.size()) + 1;
		return movies.get(rNum);
	}

	@RequestMapping("/movies/random")
	public Movies oneRandomMovieByGenre(@RequestParam(value = "genre", required = false) String genre) {
		List<Movies> movies = mrepo.findByGenreContainingIgnoreCaseOrderByGenre(genre);
		Random r = new Random();
		int rNum = r.nextInt(movies.size()) + 1;
		return movies.get(rNum);
	}

	@RequestMapping("/movies/random/list")
	public List<Movies> randomMovieList(@RequestParam(value = "size", required = false) int size) {
		List<Movies> allMovies = mrepo.findAll();
		ArrayList<Movies> movies = new ArrayList<>();
		for (int i = 1; i <= size; ++i) {
			Random r = new Random();
			int rNum = r.nextInt(allMovies.size()) + 1;
			movies.add(allMovies.get(rNum));
		}
		return movies;
	}
//	@GetMapping("/genres")	
//	public List<String> allGenres(){
//		Query sql = em.createNativeQuery("SELECT DISTINCT genre FROM Movies", List.class);
//		List<String> genres = sql.getResultList();
//		return genres;
//	}
//
//	@RequestMapping("/movies-by")
//	public List<Movies> allMoviesByTitle(@RequestParam(value="title", required=false) String title){
//		return mrepo.findByTitleIgnoreCaseOrderByTitle(title);
//	}
}
