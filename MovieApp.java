import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String choice="yes";

	


Movie m=new Movie(null,null);
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("Movies are listed by category; Scifi,Horror, Comedy, Action");
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("The matrix","SciFi"));
		list.add(new Movie("A Space odyssey","SciFi"));
		list.add(new Movie("Blade runner", "SciFi"));
		list.add(new Movie("American Pie", "comedy"));
		list.add(new Movie("Hot Fuzz", "comedy"));
		list.add(new Movie("The Exorcist",  "horror"));
		list.add(new Movie("The Rite ", "horror"));
		list.add(new Movie("The Dark Knight", "action"));
		list.add(new Movie("Casino Royale", "action"));
		list.add(new Movie("The Possesion" ,"action"));
		
		
		
		
		do{
		try{
		
		System.out.println("What category you are interested");
		String categoryChoice = sc.next();
		if (!categoryChoice.equalsIgnoreCase("scifi") ||!categoryChoice.equalsIgnoreCase("comedy") || !categoryChoice.equalsIgnoreCase("horror")|| !categoryChoice.equalsIgnoreCase("action")){
			throw new IllegalArgumentException("Enter a valid input :(Scifi,comedy,horror,action)");
			
		}else
		for (Movie movie : list) {
			if (categoryChoice.equalsIgnoreCase(movie.getCategory())) {
				System.out.println(movie);
			
		}
		
	}
		}catch (IllegalArgumentException ex){
			System.out.println(ex.getMessage());
			
		}
		System.out.println("Do yo want to continue:(yes/no)");
		 choice=sc.next();
		}while (choice.equalsIgnoreCase("yes"));
		
	     System.out.println("Good bye");
	
	}
	

}
