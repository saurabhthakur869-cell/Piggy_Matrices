package com.spring.core._6typesofinjection_setter_constructor_and_fieldinjection;

import newpackage.Tests;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spring.core._6typesofinjection_setter_constructor_and_fieldinjection","newpackage"})
public class Start {

    public static void main(String[] args) {

//        Animal animal=new Cat();
//        Persion p=new Persion(animal);
//        p.playWithAnimal();

        ApplicationContext context = SpringApplication.run(Start.class, args);
        Persion personBean = context.getBean(Persion.class);
        personBean.playWithAnimal();
        System.out.println(personBean);

        Tests testBean = context.getBean(Tests.class);
        testBean.testing();



    }
}
