package com.wasiniewski.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wasiniewski.examples.a1")
//@SpringBootApplication
class SimpleSpringContextLauncherApplication {

    public static void main(String[] args) {
        var contex = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class);

        Arrays.stream(contex.getBeanDefinitionNames())
                .forEach(System.out::println);
    }

}