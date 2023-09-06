package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.repository.JacketRepository;
import com.xworkz.CrudOperation.app.repository.JacketRepositoryImpl;

public class JacketRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in JacketRunner");
		JacketRepository jacketRepository=new JacketRepositoryImpl();
		jacketRepository.wear("levis");
		jacketRepository.wear("PeterEngland");
		jacketRepository.wear("Louis Phillipe");
		jacketRepository.wear("H&M");
		jacketRepository.wear("Puma");
		jacketRepository.wear("Nike");
		jacketRepository.wear("Adidas");
		jacketRepository.wear("Amazon");
		jacketRepository.wear("Zara");
	}

}
