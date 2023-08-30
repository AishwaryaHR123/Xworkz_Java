package com.xworkz.Abstraction.Runner;

import com.xworkz.Abstraction.implementation.Application;
import com.xworkz.Abstraction.implementation.SoftwareDev;
import com.xworkz.Abstraction.rule.Software;

public class SoftwareRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in SoftwareRunner");
		Software software=new Application();
		SoftwareDev softwareDev=new SoftwareDev();
		softwareDev.setSoftware(software);
		softwareDev.program();
	}

}
