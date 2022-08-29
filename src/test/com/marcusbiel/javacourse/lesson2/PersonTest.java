package com.marcusbiel.javacourse.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest{
private static final String[] MY_STATE_VALUES = {"PENDING","PROCESSING","COMPLETED"};

    @Test
    public void shouldReturnHelloWorld(){
        Person marcus = new Person();
        assertEquals("Hello World",marcus.helloWorld());
    }

    @Test
    public void shouldReturnHelloMarcus(){
        Person person = new Person();
        assertEquals("Hello Marcus",person.hello("Marcus"));
    }

    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        assertEquals(3,Person.numberOfPersons());

    }

    @Test
    public void demonstrateArrays(Person[] persons){
        final int[] ps = {1,2,3};
        ps[0]=1;
//       Person[] persons = new Person[4];
//       persons[0] = new Person();
//       persons[1] = new Person();
//       persons[2] = new Person();
//       persons[3] = new Person();
//       persons[3] = persons[1];
       for (int i=0;i<persons.length;i++){
           persons[i] = new Person();
           persons[i].helloWorld();
       }

       for(Person person:persons){
           person.helloWorld();
       }
       int[] myInts = new int[3];

       for (String state: MY_STATE_VALUES){
           if (state.equals("PENDING"))
               System.out.println("Pending...");
           else if (state.equals("PROCESSING"))
               System.out.println("Processing...");
           else System.out.println("Other");

       }
    }

}