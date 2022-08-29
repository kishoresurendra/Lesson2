package com.marcusbiel.javacourse.lesson10;

public class MainClass {

    public static void main(String[] args) {
        LoggingLevel state = LoggingLevel.COMPLETED;
        state = LoggingLevel.PROCESSING;
        for(LoggingLevel lev:LoggingLevel.values()){
            System.out.println(lev);
        }
        System.out.println(LoggingLevel.valueOf("COMPLETED"));
        System.out.println("Test");
    }

}
