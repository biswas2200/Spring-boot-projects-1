package com.praticeQuestion.streamAPI;

import java.util.Arrays;

//enumeration (enum for short)
enum Status{
Running, Delay, Pending,Success, Fail;
}
public class EnumPractice {
    public static void main(String[] args) {
        Status[] sarr = Status.values();
        Status s1 = Status.Delay;


        try {
            Status s = Status.valueOf("Anything"); //IllegalArgumentException
            System.out.println(s);
        }catch (IllegalArgumentException exception){
            System.out.println("valueof(\"Anything\") will return IllegalArgument" +
                    "Exception if value is\nnot present in enum ");
        }


        System.out.println(s1.describeConstable());//Optional[EnumDesc[Status.Pending]]
        System.out.println(s1);
        System.out.println(Arrays.toString(sarr));

    }
}
