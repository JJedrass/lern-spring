package com.wasiniewski.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.wasiniewski.game.GameRunner;
import com.wasiniewski.game.GamingConsole;



@Component
class YourBusinessClass {

    Dependency1 dependency1;

    Dependency2 dependency2;

    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("constructor");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    //    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("Setter injection1");
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Setter injection2");
//        this.dependency2 = dependency2;
//    }

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan()
//@SpringBootApplication
class DependencyInjectionLauncherApplication {

    public static void main(String[] args) {
        var contex = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class);

        Arrays.stream(contex.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println(contex.getBean(YourBusinessClass.class));
    }

}