package com.douglasmatosdev.services;

import com.douglasmatosdev.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        
        return persons;
    }

    private Person mockPerson(int i) {
        logger.info("Find all people!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name " + i);
        person.setLastName("Last name " + i);
        person.setAddress("Some address in Brazil " + i);
        person.setGender("Male");
        return person;
    }

    public Person findById(String id) {

        logger.info("Find one Person!");

        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFirstName("Douglas");
        person.setLastName("Silva");
        person.setAddress("Duque de Caxias - Rio de Janeiro - Brazil");
        person.setGender("Male");

        return person;
    }
}
