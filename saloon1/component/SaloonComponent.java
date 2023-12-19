package com.xworkz.saloon1.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Component
@RequestMapping("/")
public class SaloonComponent {
	public SaloonComponent() {
		System.out.println("Created PlaceComponent...");
	}
	@PostMapping("/door")
	public String onSave(Model model,@RequestParam String name,@RequestParam String date,@RequestParam String time,
			@RequestParam String email,@RequestParam String mobileNo,@RequestParam String location,@RequestParam String age,
			@RequestParam String purpose,@RequestParam String gender,@RequestParam String member,@RequestParam String payment)
	{
		System.out.println("Running onClick...");
		model.addAttribute("msg", "Details Saved Successfully....");
		System.out.println("Name : "+name);
		System.out.println("Date: "+date);
		System.out.println("Time: "+time);
		System.out.println("Email: "+email);
		System.out.println("MobileNo: "+mobileNo);
		System.out.println("Location: "+location);
		System.out.println("Age: "+age);
		System.out.println("Purpose: "+purpose);
		System.out.println("Gender: "+gender);
		System.out.println("Member: "+member);
		System.out.println("Payment: "+payment);
		return "Saloon.jsp";
	}

	

}
