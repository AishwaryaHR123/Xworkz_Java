package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.Service.MedicineSeriviceImpl;
import com.xworkz.CrudOperation.app.Service.MedicineService;
import com.xworkz.CrudOperation.app.repository.MedicineRepository;
import com.xworkz.CrudOperation.app.repository.MedicineRepositoryImpl;

public class MedicineServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MedicineRunner");
		MedicineRepository medicineRepository=new MedicineRepositoryImpl();
		MedicineService medicineService=new MedicineSeriviceImpl(medicineRepository);
		medicineService.validateAndCure("DOLO");

	}

}
