package com.spring.core._7Anotherway_creatingbean_bean_annotation;

import org.springframework.stereotype.Component;

public class Samosa {
    String name;

    public Samosa(String name){
        System.out.println("this is "+name);
        this.name=name;
    }
    public void eat(){
        System.out.println("wow samosa is very spicy");
        System.out.println(name);
    }
}
