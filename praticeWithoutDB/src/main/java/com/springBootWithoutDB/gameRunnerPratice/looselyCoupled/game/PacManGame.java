package com.springBootWithoutDB.gameRunnerPratice.looselyCoupled.game;

public class PacManGame implements GamingConsole {
    public void up(){
        System.out.println("Upside");
    }
    public void down(){
        System.out.println("DownSide");
    }
    public void left(){
        System.out.println("BackSide");
    }
    public void right(){
        System.out.println("FrontSide");
    }
}
