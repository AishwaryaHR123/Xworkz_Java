package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.WeatherDTO;
import com.xworkz.newspaper.app.repository.WeatherRepository;
import com.xworkz.newspaper.app.repository.WeatherRepositoryImpl;
import com.xworkz.newspaper.app.service.WeatherService;
import com.xworkz.newspaper.app.service.WeatherServiceImpl;

public class WeatherRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in WeatherRunner ");
		WeatherRepository weatherRepository=new WeatherRepositoryImpl();
		WeatherService weatherService=new WeatherServiceImpl(weatherRepository);
		WeatherDTO dto=new WeatherDTO("Rajajinagar", 27, "Rainy", 300);
		boolean persisted= weatherService.validateAndSave(dto);
		System.out.println("Persisted = "+persisted);
	}

}
