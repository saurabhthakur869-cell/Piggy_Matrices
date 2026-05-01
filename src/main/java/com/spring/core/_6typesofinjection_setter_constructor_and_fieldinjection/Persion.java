package com.spring.core._6typesofinjection_setter_constructor_and_fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("persion")
public class Persion {
    @Autowired
    Animal animal;
    @Autowired
    Student student;

    // 1.constructor based injection (-->Mandatory dependency.)
//    @Autowired
//    public Persion(Animal animal,Student student){
//        System.out.println("calling constrctor..autowiring");
//        this.animal=animal;
//        this.student=student;
//    }


    // 2.Setter Injection (-->Optional/changeable dependency.)
    //using autowired on setter : animal
//    @Autowired
//    public void setAnimal(Animal animal) {
//        System.out.println("setting animal");
//        this.animal = animal;
//    }
//
//    //using autowired on setter : student
//    @Autowired
//    public void setStudent(Student student) {
//        System.out.println("setting student");
//        this.student = student;
//    }


    // 3.Field based injection(-->Use for quick testing/small projects; avoid in real projects.)
    //using autowire on Field : student

    public void playWithAnimal() {
        //using animal
        animal.play();
        student.detail();
    }
}
