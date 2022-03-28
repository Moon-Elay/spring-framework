package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {
    @Bean
    Car car(){
        Car c= new Car();
        c.setMake("Monda");
        return c;
    }

   /*
    Direct Wiring
    @Bean
    Person person(){
        Person p= new Person();
        p.setName("Mike");
        p.setCar(car());
        return p;

    }

    */

    //Aotuwiring

    @Bean
    Person person(){
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car());
        return p;
    }

}
