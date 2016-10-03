/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
package LabA;

/**
 * Responsibility: Hold information about any ONE movie.
 */
public class Movie {
	private int id;
	private String title;
	private String category;
	private String description;
	private Integer year;
	private String rating;
	private boolean blackandwhite;
	private String origin;

	public Movie() {
	}

	// Constructor
	public Movie(String t, String c) {
		title = t;
		category = c;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// getter
	public String getTitle() {
		return title;
	}

	// getter
	public String getCategory() {
		return category;
	}

	// getter
	public String getDescription() {
		return description;
	}

	// setter
	public void setTitle(String title) {
		this.title = title;
	}

	// setter
	public void setCategory(String category) {
		this.category = category;
	}

	// setter
	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public boolean isBlackandwhite() {
		return blackandwhite;
	}

	public void setBlackandwhite(boolean blackandwhite) {
		this.blackandwhite = blackandwhite;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + "]";
	}

}
