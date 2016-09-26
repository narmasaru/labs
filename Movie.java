public class Movie {
	
/**
 * Responsibility:Hold information for any one movie
 * 
 * 	
 */
	
	
	private String title;
	private String category;
	
	public Movie (String t, String c) {
		title = t;
		category = c;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}

