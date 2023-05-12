package com.douglasmatosdev.services;

import com.douglasmatosdev.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

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
