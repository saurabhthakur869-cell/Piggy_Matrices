package com.spring.core._7Anotherway_creatingbean_bean_annotation;

import newpackage.Tests;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spring.core._7Anotherway_creatingbean_bean_annotation","newpackage"})
public class Start {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(Start.class, args);
        Persion personBean = context.getBean(Persion.class);
        personBean.playWithAnimal();
        System.out.println(personBean);

        Tests testBean = context.getBean(Tests.class);
        testBean.testing();


    }
    //declaring the bean using @Bean
//    @Bean(name = "samosa1")
//    public Samosa getSamosa1(){
//        return new Samosa("Tandoori samosa");
//    }
//
//    @Bean(name = "samosa2")
////    @Primary
//    public Samosa getSamosa2(){
//        return new Samosa("Meeta samosa");
//    }
}
