package com.xworkz.fertilizer.repository;

import com.xworkz.fertilizer.entity.FertilizerEntity;

import javax.persistence.*;

public class FertilizerRepositoryImpl implements FertilizerRepository{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(FertilizerEntity entity) {
        System.out.println("Starting save of FertilizerEntity :"+entity);
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            System.out.println("Starting ET ");
            et.begin();
            System.out.println("Starting Persist");
            em.persist(entity);
            System.out.println("Persist Success..");
            et.commit();
            return  entity.getId();

        }
        catch (PersistenceException pe)
        {
            System.err.println("PersistenceException in save method of Fertilizer "+pe.getMessage());
            et.rollback();

        }
        finally {
            System.out.println("Closing the resources");
            em.close();

        }
        return null;
    }
}
