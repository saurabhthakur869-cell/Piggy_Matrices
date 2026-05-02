package com.spring.core._3beans_dependencies_management_usingspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class Start {

    public static void main(String[] args) {

//        Animal animal=new Cat();
//        Persion p=new Persion(animal);
//        p.playWithAnimal();

        ApplicationContext context=SpringApplication.run(Start.class, args);
        Persion pBean=context.getBean(Persion.class);
        pBean.playWithAnimal();
    }
}
/*
@Component -> About Beans -> Creates objects (beans) in the Spring container
@Autowired -> About Dependency -> Injects dependencies automatically (Dependency Injection)
@ComponentScan -> About Scanning -> Finds classes annotated with @Component in specified packages
@SpringBootApplication -> About Application -> Starts application, scans components, and enables auto-configuration
*/

