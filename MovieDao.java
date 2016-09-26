import java.util.List;
import java.util.Set;
/**
 * @author User
 * Responsibility:Store a collection of all the movies
 * 
 *
 */
public interface MovieDao {
	
	List<Movie> getAllMovies();
	
	List<Movie> getMoviesByCategory(String cat);
	
	Set<String> getAllCategories();
	
	boolean isValidCategory(String category);

}