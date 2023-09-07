package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.PrinterDTO;
import com.xworkz.newspaper.app.repository.PrinterRepository;
import com.xworkz.newspaper.app.repository.PrinterRepositoryImpl;
import com.xworkz.newspaper.app.service.PrinterService;
import com.xworkz.newspaper.app.service.PrinterServiceImpl;

public class PrinterRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PrinterRunner");
		PrinterRepository printerRepository=new PrinterRepositoryImpl();
		PrinterService printerService=new PrinterServiceImpl(printerRepository);
		PrinterDTO dto=new PrinterDTO(2, "OfficePrinter", "Bluetooth", 2000);
		boolean persisted=printerService.validateAndSave(dto);
		System.out.println("persisted = "+persisted);
	}

}
