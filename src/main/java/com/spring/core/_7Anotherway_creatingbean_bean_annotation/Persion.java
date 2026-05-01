package com.spring.core._7Anotherway_creatingbean_bean_annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("persion")
public class Persion {
    @Autowired
    Animal animal;
    @Autowired
    Student student;

    @Autowired
            @Qualifier("samosa1")
    Samosa samosa;


    public void playWithAnimal() {
        //using animal
        animal.play();
        student.detail();
        samosa.eat();
    }
}