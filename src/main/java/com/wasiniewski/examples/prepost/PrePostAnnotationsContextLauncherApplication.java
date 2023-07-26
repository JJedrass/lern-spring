package com.wasiniewski.examples.prepost;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{

    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("All dependensies ready");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup () {
        System.out.println("cleanup");
    }
}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Using some dependency");
    }
}

@Configuration
@ComponentScan()
//@SpringBootApplication
class PrePostAnnotationsContextLauncherApplication {

    public static void main(String[] args) {
        try (var contex = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {
            Arrays.stream(contex.getBeanDefinitionNames())
                    .forEach(System.out::println);

        }


    }

}