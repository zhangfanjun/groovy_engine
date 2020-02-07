package com.example.groovy_engine.groovy

import com.example.groovy_engine.model.Person

void personGroovy(Person person){
    if(person.getGrade()>2){
        person.setMeetingShow(true)
    }
}