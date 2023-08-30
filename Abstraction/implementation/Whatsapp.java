package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.SocialMedia;

public class Whatsapp {
	private SocialMedia socialMedia;

	public void connect() {
		System.out.println("invoking connect in Whatsapp");
		this.socialMedia.connect();
	}

	public void setMedia(SocialMedia socialMedia) {
		System.out.println("invoking setMedia in Whatsapp");
		this.socialMedia = socialMedia;
	}

}
