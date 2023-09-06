package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.Service.PilotService;
import com.xworkz.CrudOperation.app.Service.PilotServiceImpl;
import com.xworkz.CrudOperation.app.repository.PilotRepository;
import com.xworkz.CrudOperation.app.repository.PilotRepositoryImpl;

public class PilotServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PilotServiceRunner");
		PilotRepository pilotRepository=new PilotRepositoryImpl();
		PilotService pilotService=new PilotServiceImpl(pilotRepository);
		pilotService.validateAndNavigate("BE");
	}

}
