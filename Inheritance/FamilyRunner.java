package com.xworkz.Inheritance;

public class FamilyRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in FamilyRunner");
		Family family=new Family();
		Family family1=new GreatGrandFather();
		Family family2=new GrandFather();
		Family family3=new Father();
		Family family4=new Son();
		Family family5=new GrandSon();
		Family family6=new GreatGrandSon();
		family.familyInfo();
		System.out.println(family.name);
		GreatGrandFather greatGrandFather=new GreatGrandFather();
		GreatGrandFather greatGrandFather1=new GrandFather();
		GreatGrandFather greatGrandFather2=new Father();
		GreatGrandFather greatGrandFather3=new Son();
		GreatGrandFather greatGrandFather4=new GrandSon();
		GreatGrandFather greatGrandFather5=new GreatGrandSon();
		greatGrandFather.greatGrandInfo();
		System.out.println(greatGrandFather.age);
		GrandFather grandFather=new GrandFather();
		GrandFather grandFather1=new Father();
		GrandFather grandFather2=new Son();
		GrandFather grandFather3=new GrandSon();
		GrandFather grandFather4=new GreatGrandSon();
		grandFather.grandFatherInfo();
		System.out.println(grandFather.name);
		Father father1=new Father();
		Father father2=new Son();
		Father father3=new GrandSon();
		Father father4=new GreatGrandSon();
		father1.fatherInfo();
		System.out.println(father1.noOfSons);
		Son son=new Son();
		Son son1=new GrandSon();
		Son son2=new GreatGrandSon();
		son.sonInfo();
		System.out.println(son.sonName);
		GrandSon grandSon1=new GrandSon();
		GrandSon grandSon2=new GreatGrandSon();
		grandSon1.grandSonInfo();
		System.out.println(grandSon1.grandSonName);
		GreatGrandSon greatGrandSon1=new GreatGrandSon();
		greatGrandSon1.greatGrandSonInfo();
		System.out.println(greatGrandSon1.fatherName);

	}

}
