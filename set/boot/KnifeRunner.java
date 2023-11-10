package com.xworkz.set.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.set.app.dto.KnifeDTO;

public class KnifeRunner {

	public static void main(String[] args) {
		System.out.println("Running main in KnifeRunner");
		KnifeDTO knife1 = new KnifeDTO("Stainless Steel", 50.0, 4.5f, "Wood");
        KnifeDTO knife2 = new KnifeDTO("High Carbon Steel", 75.0, 6.2f, "Plastic");
        KnifeDTO knife3 = new KnifeDTO("Damascus Steel", 150.0, 5.0f, "G10 Composite");
        KnifeDTO knife4 = new KnifeDTO("Ceramic", 30.0, 3.8f, "Rubberized Grip");
        KnifeDTO knife5 = new KnifeDTO("Titanium", 120.0, 4.0f, "Aluminum");
        KnifeDTO knife6 = new KnifeDTO("Steel", 60.0, 5.5f, "Bone");
        KnifeDTO knife7 = new KnifeDTO("High Carbon Steel", 75.0, 6.2f, "Plastic");
        Collection<KnifeDTO> knifeCollection=new HashSet<KnifeDTO>();
        knifeCollection.add(knife1);
        knifeCollection.add(knife2);
        knifeCollection.add(knife3);
        knifeCollection.add(knife4);
        knifeCollection.add(knife5);
        knifeCollection.add(knife6);
        knifeCollection.add(knife7);
        System.out.println("Total Knife :"+knifeCollection.size());

        
	}

}
