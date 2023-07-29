package com.company;

public class Student {

    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printNameAndAge(){
        System.out.println("Student Name: " + name + " & Student Age: " + age);
    }

}
