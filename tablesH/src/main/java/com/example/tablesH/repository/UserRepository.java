package com.example.tablesH;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getPersonsByCity(String city) {
        // Можно получить всех и отфильтровать в Java
        // Или сделать запрос на уровне базы
        TypedQuery<User> query = entityManager.createQuery(
                "SELECT u FROM User u WHERE u.city = :city", User.class);
        query.setParameter("city", city);
        return query.getResultList();
    }
}