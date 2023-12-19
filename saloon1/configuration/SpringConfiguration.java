package com.xworkz.saloon1.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.saloon1")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("Created a Apring Configuration...");
	}

}
