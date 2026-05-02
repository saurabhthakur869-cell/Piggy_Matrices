package com.spring.core._3beans_dependencies_management_usingspring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Persion {
    @Autowired
    Animal animal;
//    public Persion(Animal animal) {
//
//        this.animal = animal;
//    }

    public void playWithAnimal(){
        //using animal
        animal.play();
    }
}
