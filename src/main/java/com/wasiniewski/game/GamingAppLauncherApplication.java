package com.wasiniewski.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wasiniewski.game")
//@SpringBootApplication
class GamingAppLauncherApplication {

    public static void main(String[] args) {
        var contex = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);

        contex.getBean(GamingConsole.class).down();
        GameRunner bean = contex.getBean(GameRunner.class);
        bean.run();
    }

}