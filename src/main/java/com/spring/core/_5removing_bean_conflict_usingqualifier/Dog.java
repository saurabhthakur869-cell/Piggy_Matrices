package com.spring.core._5removing_bean_conflict_usingqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //("dog")
@Qualifier("dog")
public class Dog implements Animal {
    @Override
    public void play() {
        System.out.println("Dog is playing");

    }
}
