package com.prejeto.PersonAPI.controller;

import com.prejeto.PersonAPI.dto.MessageResponseDTO;
import com.prejeto.PersonAPI.entity.Person;
import com.prejeto.PersonAPI.repository.PersonRepository;
import com.prejeto.PersonAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")//Mapeamento da localidade
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }


    @PostMapping//Criação de novas pessoas
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);

    }

}
