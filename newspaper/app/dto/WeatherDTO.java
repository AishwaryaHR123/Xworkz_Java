package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class WeatherDTO implements Serializable {
	private String location;
	private int temperature;
	private String weatherCondition;
	private int windSpeed;

	public WeatherDTO() {
	}

	public WeatherDTO(String location, int temperature, String weatherCondition, int windSpeed) {
		super();
		this.location = location;
		this.temperature = temperature;
		this.weatherCondition = weatherCondition;
		this.windSpeed = windSpeed;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getWeatherCondition() {
		return weatherCondition;
	}

	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}

	public int getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}

	@Override
	public String toString() {
		return "WeatherDTO [location=" + location + ", temperature=" + temperature + ", weatherCondition="
				+ weatherCondition + ", windSpeed=" + windSpeed + "]";
	}

}
