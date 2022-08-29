package com.marcusbiel.javacourse.lesson10;

public enum LoggingLevel {
    PENDING, PROCESSING, COMPLETED;

    LoggingLevel(){
        System.out.println("Constructor for enum called");
    }
}
