package com.springBootWithoutDB.gameRunnerPratice.looselyCoupled;


import com.springBootWithoutDB.gameRunnerPratice.looselyCoupled.game.GameRunner;
import com.springBootWithoutDB.gameRunnerPratice.looselyCoupled.game.GamingConsole;
import com.springBootWithoutDB.gameRunnerPratice.looselyCoupled.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new PacManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner() {
        var gameRunner = new GameRunner(game());
        return gameRunner;
    }
}
