package com.spring.core._4resolve_ambiguity_primarycomponentScan_Annotations;


import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
