package com.pluralsight;

public class Person {

    public String name;
    public int age;

    public void sayHi(String friendlyName) {
        System.out.println("hi " + friendlyName);

    }

    public Person(String passedInName, int age, int height) {
        System.out.println("passed in name: " + passedInName);
        this.name = passedInName;
        //height is measured in cm
    }
}
