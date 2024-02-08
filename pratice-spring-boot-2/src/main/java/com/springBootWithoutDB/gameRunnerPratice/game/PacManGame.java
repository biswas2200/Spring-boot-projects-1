package com.springBootWithoutDB.gameRunnerPratice.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
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
