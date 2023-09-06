package com.xworkz.CrudOperation.app.Service;

import com.xworkz.CrudOperation.app.repository.JuiceRepository;

public class JuiceServiceImpl implements JuiceService {
	private JuiceRepository juiceRepository;

	public JuiceServiceImpl(JuiceRepository juiceRepository) {
		this.juiceRepository = juiceRepository;
	}

	@Override
	public boolean validateAndSave(String juice) {
		System.out.println("invoking validateAndSave " + this.getClass().getSimpleName());
		if (juice != null && !juice.isEmpty() && juice.length() >= 3 && juice.length() <= 20) {
			System.out.println("juice is valid,stored in repo");
			if (!this.juiceRepository.isExist(juice)) {
				this.juiceRepository.store(juice);
				return true;
			} else {
				System.err.println("Juice Name " + juice + " already exists,add another one");
			}
		} 
		else {
			System.err.println("juice name " +juice+ " is invalid");
		}
		return false;
	}

}
