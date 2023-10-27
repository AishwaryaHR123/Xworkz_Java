package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LaptopModel {

	public static void main(String[] args) {
		Collection<String> model = new ArrayList();
		model.add("Dell XPS 13");
		model.add("HP Spectre x360");
		model.add("Lenovo ThinkPad X1 Carbon");
		model.add("Apple MacBook Pro");
		model.add(" ROG Zephyrus G14");
		model.add("Acer Predator Helios 300");
		model.add("Surface Laptop 4");
		model.add("Razer Blade 15");
		model.add("MSI GS66 Stealth");
		model.add("LG Gram 17");
		model.add("Huawei MateBook X Pro");
		model.add("Google Pixelbook");
		model.add("Alienware m15");
		model.add("Lenovo Yoga C940");
		model.add("ASUS ZenBook 14");
		model.add("HP Envy x360");
		model.add("Acer Aspire 5");
		model.add("MSI GE76 Raider");
		model.add("Lenovo Legion 7");
		model.add("Dell Inspiron 15");
		model.add("Acer Chromebook Spin 13");
		model.add("Microsoft Surface Go");
		model.add("LG UltraFine 5K");
		model.add("Lenovo Ideapad 5");
		model.add("ASUS TUF Gaming A15");
		model.add("Acer Swift 3");
		model.add("HP Omen 15");
		model.add("Apple MacBook Air");
		model.add("Dell Alienware Area-51m");
		model.add("ASUS VivoBook S15");
		model.add("MSI Prestige 14");
		model.add("Razer Blade Pro 17");
		model.add("Lenovo Yoga 9i");
		model.add("Microsoft Surface Pro 7");
		model.add("Predator Triton 500");
		model.add("HP Pavilion x360");
		model.add("SUS ROG Strix G15");
		model.add("LG Gram 14");
		model.add("Alienware m17 R4");
		model.add("Dell Latitude 9410");
		model.add("Lenovo ThinkPad X1 Yoga");
		model.add("Apple MacBook");
		model.add("MSI Creator 15");
		model.add("ASUS ZenBook Pro Duo");
		model.add("HP EliteBook 840");
		model.add("Microsoft Surface Book 3");
		model.add("Acer Nitro 5");
		model.add("Lenovo Flex 5");
		model.add("ASUS VivoBook Flip 14");
		model.add("Acer ConceptD 7");

		System.out.println("Total Model: " + model.size());
		Iterator<String> itr = model.iterator();
		while (itr.hasNext()) {
			String value = itr.next();
			System.out.println("modelName is :" + value);

		}

	}

}
