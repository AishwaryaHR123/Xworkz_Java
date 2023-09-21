package com.xworkz.crudoperationn.boot;

import com.xworkz.crudoperationn.app.repository.MetroRepository;
import com.xworkz.crudoperationn.app.repository.MetroRepositoryImpl;
import com.xworkz.crudoperationn.app.service.MetroService;
import com.xworkz.crudoperationn.app.service.MetroServiceImpl;
import com.xworkz.crudoperationn.dto.MetroDTO;

public class MetroRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in MetroRunner");
		MetroRepository metroRepository = new MetroRepositoryImpl();
		MetroService metroService = new MetroServiceImpl(metroRepository);
		MetroDTO dto = new MetroDTO("English", "Mahalakshmi", "Rajajinagar", 20, 1000, "aish@gmail", "Aishwarya", 4,
				"Green", 2014);
		boolean persisted = metroService.validateAndSave(dto);
		System.out.println("Persisted = " + persisted);
		MetroDTO dto1 = metroService.findByLanguage("English");
		System.out.println("Found " + dto1);
	}

}
