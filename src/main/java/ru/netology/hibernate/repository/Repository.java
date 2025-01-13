package ru.netology.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.entity.PersonId;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Person, PersonId> {
    List<Person> findByCityOfLiving(String city);

    List<Person> findByAgeLessThanOrderByAge(int age);

    Optional<Person> findByNameAndSurname(String name, String surname);
}
