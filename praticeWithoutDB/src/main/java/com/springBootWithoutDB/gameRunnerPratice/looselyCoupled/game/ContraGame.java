package com.springBootWithoutDB.gameRunnerPratice.looselyCoupled.game;

public class ContraGame implements GamingConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Slide");
    }
    public void left(){
        System.out.println("Go back and Fire");
    }
    public void right(){
        System.out.println("Go Front and Fire");
    }
}
