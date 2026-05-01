package com.spring.core._6typesofinjection_setter_constructor_and_fieldinjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //("dog")
//@Qualifier("dog")
@Primary
public class Dog implements Animal {
    @Override
    public void play() {
        System.out.println("Dog is playing");

    }
}

