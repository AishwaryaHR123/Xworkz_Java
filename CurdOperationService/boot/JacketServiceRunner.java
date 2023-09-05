package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.Service.JacketService;
import com.xworkz.CrudOperation.app.Service.JacketServiceImpl;
import com.xworkz.CrudOperation.app.repository.JacketRepository;
import com.xworkz.CrudOperation.app.repository.JacketRepositoryImpl;

public class JacketServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in JacketServiceRunner");
		JacketRepository jacketRepository=new JacketRepositoryImpl();
		JacketService jacketService=new JacketServiceImpl(jacketRepository);
		jacketService.validateandWear("Louis Phillipe");

	}

}
