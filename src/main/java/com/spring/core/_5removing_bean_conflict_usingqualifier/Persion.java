package com.spring.core._5removing_bean_conflict_usingqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("persion")
public class Persion {

//    @Autowired
//    @Qualifier("dog")
    Animal animal;

    @Autowired
    public Persion(@Qualifier("cat") Animal animal) {
        this.animal = animal;
    }

    public void playWithAnimal(){
        //using animal
        animal.play();
    }
}
