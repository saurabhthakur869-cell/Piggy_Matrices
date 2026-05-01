package com.spring.core._4resolve_ambiguity_primarycomponentScan_Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Persion {
    @Autowired
    Animal animal;
    public Persion(Animal animal) {

        this.animal = animal;
    }

    public void playWithAnimal(){
        //using animal
        animal.play();
    }
}
