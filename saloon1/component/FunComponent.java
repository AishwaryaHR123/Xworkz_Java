package com.xworkz.saloon1.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class FunComponent {
	public FunComponent() {
		System.out.println("Created FunComponent");
	}
	
	@PostMapping("/bag")
	public String onClick(Model model)
	{
		System.out.println("Running onClick...");
		return "index.jsp";
	}

}
