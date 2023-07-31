package com.xworkz.AssocProgram;

public class PasteRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in PasteRunner");
		String name="Dant Kanti";
		String brand="Ayurveda";
		String company="Colgate";
		Company company1=new Company(company,"Aishu","India");
		Ingredient ingredient1=new Ingredient("meswak",20,300);
		Ingredient ingredient2=new Ingredient("Clove",50,350);
		Ingredient ingredient3=new Ingredient("pudina",35,150);
		Ingredient ingredient4=new Ingredient("salt",11,255);
		Ingredient ingredient5=new Ingredient("Haldi",10,250);
		
		Ingredient[] values= {ingredient1,ingredient2,ingredient3,ingredient4,ingredient5};
		ToothPaste toothPaste=new ToothPaste(name,brand,company,values);
		toothPaste.printInfo();
		company1.printInfo();
	}

}
