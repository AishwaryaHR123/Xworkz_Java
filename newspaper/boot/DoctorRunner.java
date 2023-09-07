package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.DoctorDTO;
import com.xworkz.newspaper.app.repository.DoctorRepository;
import com.xworkz.newspaper.app.repository.DoctorRepositoryImpl;
import com.xworkz.newspaper.app.service.DoctorService;
import com.xworkz.newspaper.app.service.DoctorServiceImpl;

public class DoctorRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in DoctorRunner ");
		DoctorRepository doctorRepository=new DoctorRepositoryImpl();
		DoctorService doctorService=new DoctorServiceImpl(doctorRepository);
		DoctorDTO dto= new DoctorDTO("Pooja", 23,"Bangalore", 5);
		boolean persisted=doctorService.validateAndSave(dto);
		System.out.println("persisted = " +persisted);
		
	}

}
