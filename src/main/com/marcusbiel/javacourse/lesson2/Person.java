package com.marcusbiel.javacourse.lesson2;
import com.marcusbiel.javacourse.lesson3.Name;

public class Person {

    private static int objectCount;

    private Name personName;

    //Constructor
    public Person(Name personName){
    this.personName = personName;
    }

    public Person(){
        //Empty on purpose: Default constructor ;
        objectCount++;
    }

    public String helloWorld(){
        return "Hello World";
    }


    public Name name(){
        return personName;
    }

    public String hello(String name) {
        return "Hello "+name;
    }

    public static int numberOfPersons() {
        return objectCount;
    }
}
