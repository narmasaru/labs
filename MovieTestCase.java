import java.util.List;

import org.junit.Assert;
import org.junit.Test;



/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class MovieTestCase {

	MovieDao dao = new MovieDaoImpl();

	@Test
	public void allMoviesShouldReturn10Movies() {
		List<Movie> allMovies = dao.getAllMovies();
		Assert.assertEquals(10, allMovies.size());
	}

	@Test
	public void theFirstMovieIsAlien() {
		List<Movie> allMovies = dao.getAllMovies();
		Movie firstMovie = allMovies.get(0);
		Assert.assertEquals("Alien", firstMovie.getTitle());
		Assert.assertEquals("scifi", firstMovie.getCategory());
	}

	@Test
	public void threeMoviesInTheScifiCategory() {
		List<Movie> moviesInScifiCat = dao.getMoviesByCategory("scifi");
		Assert.assertEquals(3, moviesInScifiCat.size());
	}

	@Test
	public void theFirstMovieInTheComedyCatIsAirplane() {
		List<Movie> moviesInComedyCat = dao.getMoviesByCategory("comedy");
		Movie firstMovie = moviesInComedyCat.get(0);
		Assert.assertEquals("Airplane", firstMovie.getTitle());
		Assert.assertEquals("comedy", firstMovie.getCategory());
	}

}
	
	


