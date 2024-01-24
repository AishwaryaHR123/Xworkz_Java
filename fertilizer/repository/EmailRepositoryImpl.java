package com.xworkz.fertilizer.repository;

import com.xworkz.fertilizer.entity.EmailEntity;

import javax.persistence.*;

public class EmailRepositoryImpl implements  EmailRepository{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(EmailEntity emailEntity) {
        System.out.println("Starting save of EmailEntity :"+emailEntity);
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            System.out.println("Starting ET ");
            et.begin();
            System.out.println("Starting Persist");
            em.persist(emailEntity);
            System.out.println("Persist Success..");
            et.commit();
            return  emailEntity.getId();

        }
        catch (PersistenceException pe)
        {
            System.err.println("PersistenceException in save method of Email "+pe.getMessage());
            et.rollback();

        }
        finally {
            System.out.println("Closing the resources");
            em.close();

        }
        return null;
    }
}
