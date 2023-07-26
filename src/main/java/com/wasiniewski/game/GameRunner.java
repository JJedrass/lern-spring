package com.wasiniewski.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

//    GamingConsole game;
    List< GamingConsole> games;

//    public GameRunner(@Qualifier("pacMan") GamingConsole game) {
//        this.game = game;
//    }
    public GameRunner(List< GamingConsole> games) {
        this.games = games;
    }

//    public void run() {
//        System.out.println("Running game: " + game);
//        game.up();
//        game.down();
//        game.left();
//        game.right();
//    }
    public void run() {
        games.forEach(GamingConsole::right);
    }
}