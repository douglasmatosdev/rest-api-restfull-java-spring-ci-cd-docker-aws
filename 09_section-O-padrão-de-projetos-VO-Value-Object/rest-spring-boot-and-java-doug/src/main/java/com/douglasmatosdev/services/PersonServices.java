package com.douglasmatosdev.services;

import com.douglasmatosdev.data.vo.v1.PersonVO;
import com.douglasmatosdev.exceptions.ResourceNotFoundException;
import com.douglasmatosdev.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    public List<PersonVO> findAll() {
        logger.info("Finding all people!");

        return repository.findAll();
    }

    public PersonVO findById(Long id) {

        logger.info("Find one Person!");

        PersonVO person = new PersonVO();

        person.setFirstName("Douglas");
        person.setLastName("Silva");
        person.setAddress("Duque de Caxias - Rio de Janeiro - Brazil");
        person.setGender("Male");

        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this IS!"));
    }

    public PersonVO create(PersonVO person) {
        logger.info("Creating one person!");

        return repository.save(person);
    }

    public PersonVO update(PersonVO person) {
        logger.info("Updating one person!");

        var entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this IS!"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getFirstName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());

        return repository.save(person);
    }

    public void delete(Long id) {
        logger.info("Deleting one person!");

        var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this IS!"));
        repository.delete(entity);
    }

}
