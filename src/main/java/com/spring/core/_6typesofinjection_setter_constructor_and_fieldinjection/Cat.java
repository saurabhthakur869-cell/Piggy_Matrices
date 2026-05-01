package com.spring.core._6typesofinjection_setter_constructor_and_fieldinjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //("cat")
//@Qualifier("cat")
//@Primary
public class Cat implements Animal {
    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}

