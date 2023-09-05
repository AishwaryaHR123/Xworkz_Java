package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.repository.PilotRepository;
import com.xworkz.CrudOperation.app.repository.PilotRepositoryImpl;

public class PilotRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PilotRunner");
		PilotRepository pRepository=new PilotRepositoryImpl();
		pRepository.navigate("BE");
		pRepository.navigate("Msc");
		pRepository.navigate("MTech");
		pRepository.navigate("Bsc");
		pRepository.navigate("MS");
		pRepository.navigate("MCA");
		pRepository.navigate("BCA");
		pRepository.navigate("BBA");
		pRepository.navigate("MBA");
		pRepository.navigate("CSE");
	}

}
