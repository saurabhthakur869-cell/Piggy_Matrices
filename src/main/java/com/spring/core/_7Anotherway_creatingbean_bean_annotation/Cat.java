package com.spring.core._7Anotherway_creatingbean_bean_annotation;

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

