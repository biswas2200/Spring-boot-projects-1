package com.springBootWithoutDB.gameRunnerPratice.tightlyCoupled;

import com.springBootWithoutDB.gameRunnerPratice.tightlyCoupled.game.ContraGame;
import com.springBootWithoutDB.gameRunnerPratice.tightlyCoupled.game.GameRunner;
import com.springBootWithoutDB.gameRunnerPratice.tightlyCoupled.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var contraGame = new ContraGame();
        //var gameRunner = new GameRunner(contraGame);
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

        /**
         * Above [var gameRunner = new GameRunner(contraGame);] is undefined because of tightly coupling
         * if we want to run contraGame methods we have to change it via in GameRunner.Class
         *explicitly by <p>Creating as object and later passing it, using constructor.</p>
         */
    }
}
