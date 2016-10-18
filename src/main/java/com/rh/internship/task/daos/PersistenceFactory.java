package com.rh.internship.task.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Saeed Zarinfam
 */
public class PersistenceFactory {
    private static PersistenceFactory persistenceFactory;
    private static EntityManagerFactory entityManagerFactory;

    private PersistenceFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
    }

    public static PersistenceFactory INSTANCE(){
        if (persistenceFactory == null){
            persistenceFactory = new PersistenceFactory();
        }

        return persistenceFactory;
    }

    public EntityManager createEm(){
        return entityManagerFactory.createEntityManager();
    }

}
