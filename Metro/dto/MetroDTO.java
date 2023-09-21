package com.xworkz.crudoperationn.dto;

import java.io.Serializable;

public class MetroDTO implements Serializable {
	private String language;
	private String fromStation;
	private String toStation;
	private double fare;
	private int noOfPassenger;
	private String email;
	private String userName;
	private int rating;
	private String line;
	private int since;

	public MetroDTO() {
	}

	public MetroDTO(String language, String fromStation, String toStation, double fare, int noOfPassenger, String email,
			String userName, int rating, String line, int since) {
		super();
		this.language = language;
		this.fromStation = fromStation;
		this.toStation = toStation;
		this.fare = fare;
		this.noOfPassenger = noOfPassenger;
		this.email = email;
		this.userName = userName;
		this.rating = rating;
		this.line = line;
		this.since = since;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	@Override
	public String toString() {
		return "MetroDTO [language=" + language + ", fromStation=" + fromStation + ", toStation=" + toStation
				+ ", fare=" + fare + ", noOfPassenger=" + noOfPassenger + ", email=" + email + ", userName=" + userName
				+ ", rating=" + rating + ", line=" + line + ", since=" + since + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof MetroDTO) {
				System.out.println("Object is a MetroDTO");
			}
			MetroDTO casted = (MetroDTO) obj;
			if (casted.language.equals(obj) && casted.email.equals(obj) && casted.fromStation.equals(obj)
					&& casted.toStation.equals(obj) && casted.line.equals(obj) && casted.userName.equals(obj)
					&& casted.fare == fare && casted.noOfPassenger == noOfPassenger && casted.rating == rating
					&& casted.since == since) {
				System.out.println("instance is same");
				return true;
			} else {
				System.err.println("instance is not same");
				return false;
			}

		}
		return super.equals(obj);
	}

}
