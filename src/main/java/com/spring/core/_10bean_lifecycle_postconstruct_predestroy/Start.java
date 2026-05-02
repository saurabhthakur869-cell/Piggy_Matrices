package com.spring.core._10bean_lifecycle_postconstruct_predestroy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Start {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(Start.class, args);

    }

}
