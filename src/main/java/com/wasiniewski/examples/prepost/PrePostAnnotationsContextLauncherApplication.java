package com.wasiniewski.examples.prepost;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
//@SpringBootApplication
class PrePostAnnotationsContextLauncherApplication {

    public static void main(String[] args) {
        var contex = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class);

        Arrays.stream(contex.getBeanDefinitionNames())
                .forEach(System.out::println);
    }

}