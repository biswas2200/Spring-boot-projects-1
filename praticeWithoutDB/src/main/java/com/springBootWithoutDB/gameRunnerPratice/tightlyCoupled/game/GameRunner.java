package com.springBootWithoutDB.gameRunnerPratice.tightlyCoupled.game;

public class GameRunner {
    MarioGame game;
    public GameRunner(MarioGame game){
        this.game = game;
    }
    public void run(){
        System.out.println("Running....."+game);
        MarioGame.up();
        MarioGame.down();
        MarioGame.left();
        MarioGame.right();

        /*ContraGame game;
    public GameRunner(ContraGame game){
        this.game = game;
    }
    public void run(){
        System.out.println("Running....."+game);
        MarioGame.up();
        MarioGame.down();
        MarioGame.left();
        MarioGame.right();*/

    }
}
