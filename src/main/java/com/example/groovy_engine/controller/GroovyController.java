package com.example.groovy_engine.controller;

import com.example.groovy_engine.model.Person;
import com.example.groovy_engine.model.ResponseVO;
import com.example.groovy_engine.service.GroovyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/groovy")
public class GroovyController {
    @Autowired
    private GroovyService groovyService;

    @RequestMapping("/person")
    public Person personGroovy(){
        Person person = new Person("80004304", "me", 3);
        return groovyService.excute(person);
    }
}
