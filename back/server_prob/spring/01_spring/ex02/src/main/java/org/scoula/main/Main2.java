package org.scoula.main;

import org.scoula.beans.Person2;
import org.scoula.beans.Person3;
import org.scoula.config.ProjectConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class Main2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);

        Person2 person2 = context.getBean(Person2.class);
        Person3 person3=context.getBean(Person3.class);

        System.out.println("\uF0A7 Person's name : "+person2.getName());
        System.out.println("\uF0A7 Person's parrot : "+person2.getParrot2().getName());
    }
}
