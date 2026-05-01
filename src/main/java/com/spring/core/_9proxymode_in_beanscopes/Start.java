package com.spring.core._9proxymode_in_beanscopes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Start {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(Start.class, args);


        Pepsi pepsi = context.getBean(Pepsi.class);
        System.out.println(pepsi);
        Soda soda = pepsi.getSoda();
        System.out.println(soda);

        Pepsi pepsi1 = context.getBean(Pepsi.class);
        System.out.println(pepsi1);
        Soda soda1 = pepsi1.getSoda();
        System.out.println(soda1);

        Pepsi pepsi2 = context.getBean(Pepsi.class);
        System.out.println(pepsi2);
        System.out.println(pepsi2.getSoda());


    }

}
