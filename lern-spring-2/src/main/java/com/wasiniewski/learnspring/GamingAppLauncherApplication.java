package com.wasiniewski.learnspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wasiniewski.game.GameRunner;
import com.wasiniewski.game.GamingConsole;

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