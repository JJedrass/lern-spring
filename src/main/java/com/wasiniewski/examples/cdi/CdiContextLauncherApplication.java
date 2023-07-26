package com.wasiniewski.examples.cdi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jdk.jfr.Name;

//@Component
@Named
class BusinessService {
    private DataService dataService;

    public DataService getDataService() {
        return dataService;
    }

    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("setter injection");
        this.dataService = dataService;
    }
}

@Named
class DataService {

}
@Configuration
@ComponentScan()
class CdiContextLauncherApplication {

    public static void main(String[] args) {
        var contex = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class);

        Arrays.stream(contex.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println(contex.getBean(BusinessService.class).getDataService());
    }

}