package com.spring.core._2loose_couple;

public class Persion {

    Animal animal;
    Animal animal1;

    public Persion(Animal animal,Animal animal1) {
        this.animal = animal;
        this.animal1=animal1;
    }

    public void playWithAnimal(){
        //Using animal
        animal.play();
        animal1.play();
    }
}