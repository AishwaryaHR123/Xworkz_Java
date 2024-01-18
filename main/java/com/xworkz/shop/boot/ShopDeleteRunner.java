package com.xworkz.shop.boot;

import com.xworkz.shop.entity.ShopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopDeleteRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        System.out.println("ET "+et);
        et.begin();
        System.out.println("ET Begin");
        System.out.println("Starting Operation");
        ShopEntity delete=em.find(ShopEntity.class,2);
        if (delete!=null)
        {
            em.remove(delete);
            System.out.println("Data is Deleted..."+delete);
        }
        else {
            System.out.println("Data is not deleted...");
        }
        et.commit();
        emf.close();
        em.close();
    }
}
