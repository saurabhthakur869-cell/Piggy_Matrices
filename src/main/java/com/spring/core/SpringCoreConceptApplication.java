package com.spring.core;

import com.spring.core._1tight_couple.Persion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreConceptApplication {

    public static void main(String[] args) {

        Persion p=new Persion();
        p.playWithAnimal();
        SpringApplication.run(SpringCoreConceptApplication.class, args);
    }

}
