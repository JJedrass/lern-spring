package com.wasiniewski.examples.scope;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
class NormalClass {

}

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {

}
@Configuration
@ComponentScan
//@SpringBootApplication
class BeanScopesLauncherApplication {

    public static void main(String[] args) {
        var contex = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class);

        Arrays.stream(contex.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println(contex.getBean(NormalClass.class));
        System.out.println(contex.getBean(NormalClass.class));


        System.out.println(contex.getBean(PrototypeClass.class));
        System.out.println(contex.getBean(PrototypeClass.class));
        System.out.println(contex.getBean(PrototypeClass.class));
    }

}