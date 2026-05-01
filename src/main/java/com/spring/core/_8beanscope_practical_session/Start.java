package com.spring.core._8beanscope_practical_session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Start {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(Start.class, args);
//        Persion personBean = context.getBean(Persion.class);
//        personBean.playWithAnimal();
//        System.out.println(personBean);
//
//        Tests testBean = context.getBean(Tests.class);
//        testBean.testing();


        // Bean Scope
        //first request for pepsi bean
        Pepsi bean = context.getBean(Pepsi.class);
        System.out.println(bean);
//        bean.drink();

        //second request for Pepsi bean
        Pepsi bean1 = context.getBean(Pepsi.class);
        System.out.println(bean1);

        //third request for Pepsi bean
        Pepsi bean2 = context.getBean(Pepsi.class);
        System.out.println(bean2);
    }

}

