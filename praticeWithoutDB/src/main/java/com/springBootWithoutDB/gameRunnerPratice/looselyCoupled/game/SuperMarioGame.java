package com.springBootWithoutDB.gameRunnerPratice.looselyCoupled.game;

public class SuperMarioGame implements GamingConsole{
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Get down in hole");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("Accelerate");
    }
}
