package com.spring.core._9proxymode_in_beanscopes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")      // Same object everytime
//@Scope("prototype")        // Different object everytime
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)  // other way use
public class Pepsi {
    @Autowired
    private Soda soda;

    public Pepsi(){
        System.out.println("Creating Pepsi");
    }
    public void drink(){
        System.out.println("Pepsi is very cool");
    }

    public Soda getSoda() {
        return soda;
    }

    public void setSoda(Soda soda) {
        this.soda = soda;
    }
}
