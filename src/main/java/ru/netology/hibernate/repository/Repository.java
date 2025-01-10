package ru.netology.hibernate.repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ru.netology.hibernate.entity.Person;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    @PersistenceContext
    private EntityManager manager;

    public List<Person> getPersonsByCity(String city) {
        return manager.createQuery("SELECT p FROM Person p where lower(p.cityOfLiving) = lower(:city)", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}