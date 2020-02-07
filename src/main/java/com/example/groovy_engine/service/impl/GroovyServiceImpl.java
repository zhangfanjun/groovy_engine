package com.example.groovy_engine.service.impl;

import com.example.groovy_engine.model.Person;
import com.example.groovy_engine.service.GroovyService;
import groovy.lang.Script;
import groovy.util.GroovyScriptEngine;
import groovy.util.ResourceException;
import groovy.util.ScriptException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class GroovyServiceImpl implements GroovyService {
    @Override
    public Person excute(Person person) {
        Class script = null;
        try {
            script = new GroovyScriptEngine("src/main/java/com/example/groovy_engine/groovy/")
                    .loadScriptByName("PersonScript.groovy");
            Script instance = (Script) script.newInstance();
            instance.invokeMethod("personGroovy", person);
        } catch (Exception e) {
            log.info("==={}===",e.getStackTrace());
        }

        return person;
    }
}
