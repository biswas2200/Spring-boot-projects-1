package com.praticeQuestion.streamAPI.methods;


interface StringParser{
    String parseString(String string);
}

class StringConvert{
    public static String stringConvert(String str){
        if (str.length() <= 3)
            str = str.toUpperCase();
        else
            str = str.toLowerCase();

        return str;
    }
}

class PrintValues {
    public void printValues(String str, StringParser stringParser) {
        str = stringParser.parseString(str);
        System.out.println(str);
    }
}

public class MethodReference {
    public static void main(String[] args) {
        String str = "Biswas Amitosh";
        String str1 = "sam";
        PrintValues printValues = new PrintValues();
        printValues.printValues(str1,StringConvert::stringConvert);
    }
}
