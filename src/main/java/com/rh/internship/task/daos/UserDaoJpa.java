package com.rh.internship.task.daos;

import com.rh.internship.task.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Saeed Zarinfam
 */
public class UserDaoJpa extends GeneralDaoJpa implements UserDao {

    @Override
    public Optional<User> insertUser(User user) {
        return runJpaCode(em -> {
            em.persist(user);
            return user;
        }, true);
    }

    @Override
    public Optional<User> updateUser(User user) {
        return null;
    }

    @Override
    public boolean deleteUser(long userId) {
        return runJpaCode(em -> {
                    em.remove(em.find(User.class, userId));
                    return true;
                }
                , true).orElseGet(() -> false);

    }

    @Override
    public List<User> selectAllUser() {
        return runJpaCode(em -> em.createQuery("select u from User u").getResultList()
                , false).orElseGet(ArrayList::new);
    }
}
