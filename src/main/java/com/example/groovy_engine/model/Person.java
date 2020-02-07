package com.example.groovy_engine.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    private String account;
    private String name;
    private int grade;
    private Boolean meetingShow;
    private Boolean taskShow;

    public Person(String account, String name, int grade){
        this.account=account;
        this.name=name;
        this.grade=grade;
    }
}
