import java.lang.reflect.Array;
import java.util.ArrayList;

public class Movie {
	
	private String title;
	private String category;
	
	public Movie(String title, String category){
		
		this.title = title;
		this.category = category;
		
}
  
   public void setTitle(String title){
	   this.title=title;
   }
	
	
	
	public String getTitle(){
	 return title;
 }
    
	public void setCategory(String category){
		this.category=category;
	}
	
	public String getCategory(){
		return category;
	}

	

}
