package com.springBootWithoutDB.gameRunnerPratice;

import com.springBootWithoutDB.gameRunnerPratice.game.GameRunner;
import com.springBootWithoutDB.gameRunnerPratice.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springBootWithoutDB.gameRunnerPratice.game")
public class AppGaming {

    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(AppGaming.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
