package com.spring.core._10bean_lifecycle_postconstruct_predestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student(){
        System.out.println("#:Creating student");
    }
    @PostConstruct
    public void created(){
        // Some initialization
        System.out.println("#:student bean is created:created");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("#; bye bye student");
    }
}
/* --> @PostConstruct
Runs after bean creation
Used for initialization
Executes once
Called after dependency injection
👉 Setup logic here

--> @PreDestroy
Runs before bean destruction
Used for cleanup
Closes resources (DB, files, etc.)
👉 Cleanup logic here */