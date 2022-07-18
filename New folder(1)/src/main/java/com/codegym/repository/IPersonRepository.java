package com.codegym.repository;

import com.codegym.model.Person;

import java.util.List;

public interface IPersonRepository {
    List<Person> selectAllPerson();

    Person selectPerson(int id);

    void insertPerson(Person person);

    void update(int id, Person person);

}
