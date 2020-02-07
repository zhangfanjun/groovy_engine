package com.example.groovy_engine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.groovy_engine.mapper")
public class GroovyEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(GroovyEngineApplication.class, args);
    }

}
