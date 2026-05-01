package com.spring.core._7Anotherway_creatingbean_bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {
    //declaring the bean using @Bean
    @Bean(name = "samosa1")
    public Samosa getSamosa1(){
        return new Samosa("Tandoori samosa");
    }

    @Bean(name = "samosa2")
//    @Primary
    public Samosa getSamosa2(){
        return new Samosa("Meeta samosa");
    }
}
