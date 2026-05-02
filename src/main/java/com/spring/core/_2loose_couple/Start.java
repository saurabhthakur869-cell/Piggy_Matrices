package com.spring.core._2loose_couple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Start {

    public static void main(String[] args) {
        Animal animal=new Cat();
        Animal animal1=new Dog();

        Persion p=new Persion(animal,animal1);
        p.playWithAnimal();
        SpringApplication.run(Start.class, args);

    }

}