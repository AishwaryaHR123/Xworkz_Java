package com.xworkz.CurdOperationService.boot;

import com.xworkz.CurdOperationService.app.Repository.MobileNoRepository;
import com.xworkz.CurdOperationService.app.Repository.MobileNoRepositoryImpl;
import com.xworkz.CurdOperationService.app.Service.MobileNoService;
import com.xworkz.CurdOperationService.app.Service.MobileNoServiceImpl;

public class MobileNoRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MobileNoRunner ");
		MobileNoRepository mobileNoRepository = new MobileNoRepositoryImpl();
		MobileNoService mobileNoService = new MobileNoServiceImpl(mobileNoRepository);
		boolean saved = mobileNoService.validateAndSave(9591404128l);
		System.out.println("Saved = " + saved);
		mobileNoService.validateAndSave(9591404128l);
		mobileNoService.validateAndSave(8296164419l);

	}

}
