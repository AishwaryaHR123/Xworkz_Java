package com.xworkz.AssocProgram;

public class ToothPaste {
	public String name;
	public String brand;
	public String company;
	public Ingredient[] ingredient;
	
	public ToothPaste(String name,String brand,String company,Ingredient[] ingredient)
	{
		this.name=name;
		this.brand=brand;
		this.company=company;
		this.ingredient=ingredient;
	}
	public void printInfo()
	{
		System.out.println("invoking printInfo in ToothPaste");
		System.out.println("ToothPaste name is:"+this.name);
		System.out.println("ToothPaste brand is:"+this.brand);
		System.out.println("ToothPasteCompany is:"+this.company);
		for(int index=0;index<this.ingredient.length;index++)
		{
			Ingredient ref=ingredient[index];
			ref.printInfo();
		}
	}

}
