package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.Software;

public class SoftwareDev {
	private Software software;

	public void program() {
		System.out.println("invoking program in Softwaredev");
		this.software.program();
	}

	public void setSoftware(Software software) {
		System.out.println("invoking setSoftware in SoftwareDev");
		this.software = software;
	}

}
