package com.wasiniewski.examples.busniess;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
//@SpringBootApplication
class RealWorldLauncherApplication {

    public static void main(String[] args) {
        var contex = new AnnotationConfigApplicationContext(RealWorldLauncherApplication.class);

        Arrays.stream(contex.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println(contex.getBean(BusinessCalculationService.class).findMax());
    }

}