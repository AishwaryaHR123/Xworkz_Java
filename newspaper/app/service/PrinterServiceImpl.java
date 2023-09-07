package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.PrinterDTO;
import com.xworkz.newspaper.app.repository.PrinterRepository;

public class PrinterServiceImpl implements PrinterService {
	private PrinterRepository printerRepository;

	public PrinterServiceImpl(PrinterRepository printerRepository) {
		this.printerRepository = printerRepository;
	}

	@Override
	public boolean validateAndSave(PrinterDTO dto) {
		System.out.println("invoking validateAndSave in " + this.getClass().getSimpleName());
		if (dto != null) {
			System.out.println("dto is not null");
			int printId = dto.getPrintId();
			String printerName = dto.getPrinterName();
			String printerConnection = dto.getPrinterConnection();
			double cost = dto.getCost();
			if (printerName != null && !printerName.isEmpty() && printerName.length() >= 3
					&& printerName.length() <= 20) {
				System.out.println("printerName is valid");
			} else {
				System.err.println("printerName is invalid");
				return false;
			}
			if (printerConnection != null && !printerConnection.isEmpty() && printerConnection.length() >= 3
					&& printerConnection.length() <= 20) {
				System.out.println("printerConnection is valid");
			} else {
				System.err.println("printerConnection is invalid");
				return false;
			}
			if (printId > 0 && cost > 0) {
				System.out.println("printId and cost is valid");
			} else {
				System.err.println("printId and cost is invalid");
				return false;
			}
			this.printerRepository.save(dto);
			return true;
		}
		return false;
	}

}
