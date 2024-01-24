package com.xworkz.fertilizer.repository;

import com.xworkz.fertilizer.entity.TravelEntity;

import javax.persistence.*;

public class TravelRepositoryImpl implements  TravelRepository{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(TravelEntity entity) {
        System.out.println("Starting save of TravelEntity :"+entity);
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("Starting ET ");
            et.begin();
            System.out.println("Starting Persist");
            em.persist(entity);
            System.out.println("Persist Success..");
            et.commit();
            return entity.getId();
        }
        catch (PersistenceException persistenceException)
        {
            System.err.println("PersistenceException in save method of Travel "+persistenceException.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("Closing the resources...");
            em.close();

        }

        return null;
    }
}
