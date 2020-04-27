package co.grandcircus.lab26;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MoviesDao extends JpaRepository<Movies,Long>{


	List<Movies> findByGenreContainingIgnoreCaseOrderByGenre(String genre);
		
	List<Movies> findByTitleIgnoreCaseOrderByTitle(String title);
}
