package com.spring.core._8beanscope_practical_session;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")      // Same object everytime
//@Scope("prototype")        // Different object everytime
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)  // other way use
public class Pepsi {

    public Pepsi(){
        System.out.println("Creating Pepsi");
    }
    public void drink(){
        System.out.println("Pepsi is very cool");
    }

}
