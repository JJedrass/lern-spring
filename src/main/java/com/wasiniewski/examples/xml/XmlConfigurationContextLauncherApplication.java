package com.wasiniewski.examples.xml;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;


class XmlConfigurationContextLauncherApplication {

    public static void main(String[] args) {
        var contex = new ClassPathXmlApplicationContext("contextConfiguration.xml");

        Arrays.stream(contex.getBeanDefinitionNames())
                .forEach(System.out::println);
    }

}