package com.wasiniewski.examples.lazy;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("init logic");
        this.classA = classA;
    }


}

@Configuration
@ComponentScan()
//@SpringBootApplication
class LazyContextLauncherApplication {

    public static void main(String[] args) {
        var contex = new AnnotationConfigApplicationContext(LazyContextLauncherApplication.class);

//        Arrays.stream(contex.getBeanDefinitionNames())
//                .forEach(System.out::println);
        System.out.println("Initialization of context finished");

//        contex.getBean(ClassB.class);
    }

}