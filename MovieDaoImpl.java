import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import java.util.Set;

/**
 * Responsibility:to provide access yo all the movies.
 * 
 * 
 * @author User
 *
 */

public class MovieDaoImpl implements MovieDao {

	private List<Movie> movies = new ArrayList<Movie>();
	
private Set<String> catagorySet;
	public MovieDaoImpl() {

		movies.add(new Movie("Alien", "scifi"));
		movies.add(new Movie("Aliens", "scifi"));
		movies.add(new Movie("Prometheus", "scifi"));
		movies.add(new Movie("Airplane", "comedy"));
		movies.add(new Movie("Planes, Trains, and Automobiles", "comedy"));
		movies.add(new Movie("Nightmare on Elm Street", "horror"));
		movies.add(new Movie("Friday the 13th", "horror"));
		movies.add(new Movie("Child's Play", "horror"));
		movies.add(new Movie("Avengers", "action"));
		movies.add(new Movie("Captain America", "action"));

	}

	/**
	 * Get all the movies from the array list...every single one
	 */
	@Override
	public List<Movie> getAllMovies() {

		return movies;
	}

	@Override
	public List<Movie> getMoviesByCategory(String cat) {
		ArrayList<Movie> movieListByCat = new ArrayList<Movie>();

		for (Movie m : movies) {
			if (m.getCategory().equals(cat)) {

				movieListByCat.add(m);
			}

		}
		return movieListByCat;
	}

	@Override
	public Set<String> getAllCategories() {
		Set<Movie> allMovieCategories = new HashSet<>();
		List<Movie> result = new ArrayList<Movie>();
		// Defining Set string variable titles from Hashset
		Set<String> catagory = new HashSet<String>();

		for (Movie m : movies) {
			if (catagory.add(m.getCategory())) {
				result.add(m);
				
			}
		}
		return catagory;

	}

	@Override
	public boolean isValidCategory(String cat) {
		catagorySet=getAllCategories();
		if (catagorySet.contains(cat))
			return true;
		else
			return false;

	}

}
