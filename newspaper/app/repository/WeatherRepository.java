package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.WeatherDTO;

public interface WeatherRepository {
	int TOTAL_DETAIL=10;
	void save(WeatherDTO dto);

}
