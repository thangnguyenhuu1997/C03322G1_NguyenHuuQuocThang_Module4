package com.codegym.service;

import com.codegym.model.Person;
import com.codegym.repository.IPersonRepository;
import com.codegym.repository.PersonRepository;

import java.util.List;

public class PersonService implements IPersonService {
    private IPersonRepository personRepository = new PersonRepository();
    @Override
    public List<Person> selectAllPerson() {
        return personRepository.selectAllPerson();
    }

    @Override
    public Person selectPerson(int id) {
        return personRepository.selectPerson(id);
    }

    @Override
    public void insertPerson(Person person) {
        personRepository.insertPerson(person);
    }

    @Override
    public void update(int id, Person person) {
        personRepository.update(id,person);
    }
}
