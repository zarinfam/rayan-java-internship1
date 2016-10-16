package com.rh.internship.task;

import com.rh.internship.task.models.Task;
import com.rh.internship.task.models.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sound.midi.Soundbank;
import java.sql.*;

/**
 * @author Saeed Zarinfam
 */
public class MainTaskJpa {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = entityManagerFactory.createEntityManager();

//        em.getTransaction().begin();
//
//        User user = new User("jpa user");
//        em.persist(user);
//
//        em.getTransaction().commit();

        User sara = em.find(User.class, 2l);

        System.out.println(sara.getName());

        sara.getTaskList().forEach(task -> {
            System.out.println(task.getTitle());
//            task.setDescription(task.getDescription() + "-");
//            em.merge(task);
        });

        em.close();

        entityManagerFactory.close();
    }
}
