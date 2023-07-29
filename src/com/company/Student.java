package com.company;

// Create a "Student" class in a new file with a name and an age property, a constructor to set the properties, and a method which prints out a sentence using both properties (practice classes, constructors, and concatenation)
class Student {
    String name; //name property
    int age; //age property
    Student(String n, int a){ //constructor
        this.name = n; //set name
        this.age = a;} //set age
    public void studentInfo() {//method to print student info
        System.out.println("Student " + this.name + " is " + this.age + " years old.");}} //Prints the student's name and age in a sentence

class testerClass { //class to test Student class
    public static void main(String[] args){
        Student s1 = new Student("Bob Joe Smith", 19); //creates student
        s1.studentInfo();}} //uses method to print student info