package com.xworkz.pendrive.app.dto;

public class TheaterDTO implements Comparable<TheaterDTO>{
	private String name;
	private float rating;
	private String location;
	private String movieName;
	public TheaterDTO() {
	}
	public TheaterDTO(String name, float rating, String location, String movieName) {
		super();
		this.name = name;
		this.rating = rating;
		this.location = location;
		this.movieName = movieName;
	}
	public String getName() {
		return name;
	}
	public float getRating() {
		return rating;
	}
	public String getLocation() {
		return location;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", rating=" + rating + ", location=" + location + ", movieName=" + movieName
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(rating);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TheaterDTO other = (TheaterDTO) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(rating) != Float.floatToIntBits(other.rating))
			return false;
		return true;
	}
	@Override
	public int compareTo(TheaterDTO argument) {
		TheaterDTO current=this;
		if(current.rating==argument.rating)
		{
			return 0;
		}
		if(current.rating>argument.rating)
		{
			return 456;
		}
		if(current.rating>argument.rating)
		{
			return -5;
		}
		return 0;
	}
	
}
