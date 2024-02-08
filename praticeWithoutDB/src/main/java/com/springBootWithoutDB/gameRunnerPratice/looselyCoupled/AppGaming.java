package com.springBootWithoutDB.gameRunnerPratice.looselyCoupled;

import com.springBootWithoutDB.gameRunnerPratice.looselyCoupled.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGaming {
    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
