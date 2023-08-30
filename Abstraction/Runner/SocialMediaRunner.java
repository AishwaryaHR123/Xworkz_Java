package com.xworkz.Abstraction.Runner;

import com.xworkz.Abstraction.implementation.Facebook;
import com.xworkz.Abstraction.implementation.Whatsapp;
import com.xworkz.Abstraction.rule.SocialMedia;

public class SocialMediaRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in SocialMediaRunner");
		SocialMedia socialMedia=new Facebook();
		Whatsapp whatsapp=new Whatsapp();
		whatsapp.setMedia(socialMedia);
		whatsapp.connect();
		
		
	}

}
