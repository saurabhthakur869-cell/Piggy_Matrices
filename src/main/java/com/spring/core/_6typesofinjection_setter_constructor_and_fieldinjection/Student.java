package com.spring.core._6typesofinjection_setter_constructor_and_fieldinjection;

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
