import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 * Responsibility:Run the application by interacting with the user via the
 * console.
 * 
 * @author User
 *
 */
public class MovieList {

	private static MovieDao movieDao = new MovieDaoImpl();

	public static void main(String[] args) {
		String choice = "y";
		Scanner scan = new Scanner(System.in);

		List<Movie> movies = movieDao.getAllMovies();
        System.out.println("Welcome to Movie List Application!");

		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Movies are listed by category:");
		    movieDao.getAllCategories();
		   System.out.print("What category are you interested in? ");
			String cat = scan.nextLine();

			//if (cat.equals("scifi") || cat.equals("comedy") || cat.equals("horror") || cat.equals("action"))
			
			if (movieDao.isValidCategory(cat)){
			
				List<Movie> moviesInCat = movieDao.getMoviesByCategory(cat);

				for (Movie movie : moviesInCat) {

					System.out.println(movie.getTitle());

				}

				int count = moviesInCat.size();

				System.out.println(count + " movies found in category " + cat);
				System.out.println();
			} else {
			// movieDao.isValidCategory(cat);
				System.out.println("Invalid category.");
			}

			System.out.print("Continue? (y/n) ");
			choice = scan.nextLine();
		}

		scan.close();
		System.out.println("Goodbye.");
	}

}
