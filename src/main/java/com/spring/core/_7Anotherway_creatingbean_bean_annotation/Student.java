package com.spring.core._7Anotherway_creatingbean_bean_annotation;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student(){
        System.out.println("Creating student");
    }
    public void detail(){
        System.out.println("Student detail");
    }
}

