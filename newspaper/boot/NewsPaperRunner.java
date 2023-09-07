package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.NewsPaperDTO;
import com.xworkz.newspaper.app.repository.NewsPaperRepository;
import com.xworkz.newspaper.app.repository.NewsPaperRepositoryImpl;
import com.xworkz.newspaper.app.service.NewsPaperService;
import com.xworkz.newspaper.app.service.NewsPaperServiceImpl;

public class NewsPaperRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in NewsPaperRunner");
		NewsPaperRepository newsPaperRepository= new NewsPaperRepositoryImpl();
		NewsPaperService newsPaperService=new NewsPaperServiceImpl(newsPaperRepository);
		NewsPaperDTO dto = new NewsPaperDTO("English", 5, 50, "TOI");
		boolean persisted=newsPaperService.validateAndSave(dto);
		System.out.println("persisted= "+persisted);
		
	}

}
