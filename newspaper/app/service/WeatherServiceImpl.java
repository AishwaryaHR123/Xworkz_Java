package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.WeatherDTO;
import com.xworkz.newspaper.app.repository.WeatherRepository;

public class WeatherServiceImpl implements WeatherService {
	private WeatherRepository weatherRepository;

	public WeatherServiceImpl(WeatherRepository weatherRepository) {
		this.weatherRepository = weatherRepository;
	}

	@Override
	public boolean validateAndSave(WeatherDTO dto) {
		System.out.println("invoking validateAndSave in " + this.getClass().getSimpleName());
		if (dto != null) {
			System.out.println("dto is not null");
			String location = dto.getLocation();
			int temperature = dto.getTemperature();
			String weatherCondition = dto.getWeatherCondition();
			int windSpeed = dto.getWindSpeed();
			if (location != null && !location.isEmpty() && location.length() >= 3 && location.length() <= 20) {
				System.out.println("location is valid");
			} else {
				System.err.println("location is invalid");
				return false;
			}
			if (weatherCondition != null && !weatherCondition.isEmpty() && weatherCondition.length() >= 3 && weatherCondition.length() <= 20) {
				System.out.println("weatherCondition is valid");
			} else {
				System.err.println("weatherCondition is invalid");
				return false;
			}
			if (temperature > 0 && windSpeed > 0) {
				System.out.println("temperature and windSpeed is valid");
			} else {
				System.err.println("temperature and windSpeed is invalid");
				return false;
			}
			this.weatherRepository.save(dto);
			return true;
		}
		return false;
	}

}
