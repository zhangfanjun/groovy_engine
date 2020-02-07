package com.example.groovy_engine.service;

import com.example.groovy_engine.model.Person;

public interface GroovyService {
    /**
     * 对person执行规则
     * */
    Person excute(Person person);
}
