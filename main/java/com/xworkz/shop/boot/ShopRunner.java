package com.xworkz.shop.boot;

import com.xworkz.shop.entity.ShopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopRunner {
    public static void main(String[] args) {
     EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
     EntityManager em= emf.createEntityManager();
     EntityTransaction et= em.getTransaction();
     System.out.println("ET "+et);
     et.begin();
     System.out.println("ET Begin");
     System.out.println("Starting Operation");
     ShopEntity shopEntity1=new ShopEntity(1,"Panasonic","LED","Eye-Friendly","9 watt Hours","A15","B22D","9 watt","white","240V",2);
     ShopEntity shopEntity2=new ShopEntity(2,"surya","LED","LightWeight","8 watt Hours","A17","B23D","10 watt","white","230V",3);
     em.persist(shopEntity1);
     em.persist(shopEntity2);
     et.commit();
     System.out.println("Transaction is Committed...");
     System.out.println("Closing the emf and em...");
     emf.close();
     em.close();
    }
}
