package com.xworkz.shop.boot;

import com.xworkz.shop.entity.ShopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopUpdate {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        System.out.println("ET "+et);
        et.begin();
        System.out.println("ET Begin");
        System.out.println("Starting Operation");
        ShopEntity update=em.find(ShopEntity.class,2);
        if(update!=null)
        {
            update.setBrand("Bajaj");
            em.merge(update);
            System.out.println("Data is Updated..."+update);

        }
        else {
            System.out.println("Data is not updated...");
        }
        et.commit();
        em.close();
        emf.close();
    }
}
