package com.codegym.repository;

import com.codegym.model.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonRepository implements IPersonRepository {
    private static final Map<Integer, Person> persons;

    static {

        persons = new HashMap<>();
        persons.put(1, new Person(1,"Thắng","1997","Tàu bay","2022-04-01","2022-04-06","Đà Nẵng"));
        persons.put(1, new Person(2,"Hoàng","2002","Ô tô","2022-05-01","2022-05-10","Quảng Nam"));
    }
    @Override
    public List<Person> selectAllPerson() {
        return new ArrayList<>(persons.values());
    }

    @Override
    public Person selectPerson(int id) {
        return persons.get(id);
    }

    @Override
    public void insertPerson(Person person) {
        persons.put(person.getId(), person);
    }

    @Override
    public void update(int id, Person person) {
        persons.put(id, person);
    }
}
