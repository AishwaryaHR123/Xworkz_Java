package com.xworkz.shop.boot;

import com.xworkz.shop.entity.ShopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopFetchRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        System.out.println("ET "+et);
        et.begin();
        ShopEntity fetch=em.find(ShopEntity.class,2);
        System.out.println("Fetch Data using Find Method..."+fetch);
        et.commit();
        em.close();
        emf.close();
    }
}
