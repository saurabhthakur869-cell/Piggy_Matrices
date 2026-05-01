package com.spring.core._3beans_dependencies_management_usingspring;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
