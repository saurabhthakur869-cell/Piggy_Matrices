package com.spring.core._1tight_couple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Start {

    public static void main(String[] args) {

        Persion p=new Persion();
        p.playWithAnimal();
        SpringApplication.run(Start.class, args);
    }

}

