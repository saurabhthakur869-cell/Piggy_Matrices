package com.spring.core._5removing_bean_conflict_usingqualifier;

import newpackage.Mammals;
import newpackage.Tests;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spring.core._5removing_bean_conflict_usingqualifier","newpackage"})
public class Start {

    public static void main(String[] args) {

//        Animal animal=new Cat();
//        Persion p=new Persion(animal);
//        p.playWithAnimal();

        ApplicationContext context = SpringApplication.run(Start.class, args);
        Persion personBean = context.getBean(Persion.class);
        personBean.playWithAnimal();
        System.out.println(personBean);

        Tests testBean = context.getBean(Tests.class);
        testBean.testing();

        Animal cat = context.getBean("cat", Animal.class);
        Animal dog = context.getBean("dog", Animal.class);
        cat.play();
        dog.play();


    }
}
/*
@Component -> About Beans -> Creates objects (beans) in the Spring container
@Autowired -> About Dependency -> Injects dependencies automatically (Dependency Injection)
@ComponentScan -> About Scanning -> Finds classes annotated with @Component in specified packages
@SpringBootApplication -> About Application -> Starts application, scans components, and enables auto-configuration
*/

