package com.example.groovy_engine.groovy

import com.example.groovy_engine.model.Person

class PersonGroovy {

     Person personGroovy(Person person){
        if(person.getGrade()>2){
            person.setMeetingShow(true)
            person.setTaskShow(true)
        }
         return person
    }
}
