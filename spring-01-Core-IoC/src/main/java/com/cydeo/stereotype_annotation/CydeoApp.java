package com.cydeo.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(ConfigCourse.class);

       // Selenium s= context.getBean(Selenium.class);
      //  s.getTeachingHours();
       context.getBean(Selenium.class).getTeachingHours();

        System.out.println("==============================");

        Java j = context.getBean(Java.class);
        j.getTeachingHours();
    }
}
