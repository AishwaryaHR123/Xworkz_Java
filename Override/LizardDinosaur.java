package com.xworkz.Override;

public class LizardDinosaur extends Dinosaur{
	@Override
	public void eat() {
		System.out.println("LizardDinosaur overrides the Dinosaur");
		super.eat();
	}

}
