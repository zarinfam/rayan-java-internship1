package com.rh.internship.task.daos;

import javax.persistence.EntityManager;
import java.sql.*;
import java.util.Optional;
import java.util.function.Function;

/**
 * @author Saeed Zarinfam
 */
public class GeneralDaoJpa {
    public <T> Optional<T> runJpaCode(Function<EntityManager, T> codeBlock, boolean withTx) {

        Optional<T> ret = Optional.empty();
        EntityManager em = null;

        try {
            em = PersistenceFactory.INSTANCE().createEm();
            if (withTx) {
                em.getTransaction().begin();
            }

            ret = Optional.ofNullable(codeBlock.apply(em));

            if (withTx) {
                em.getTransaction().commit();
            }
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }

        return ret;
    }
}
