package com.company;

/* TODO:
*
* (done)Create a void method that prints all odd numbers from 0-100 (practice functions and conditions inside loops)
*
* (done)Create a method that takes an array of numbers as an argument and returns the total
* of all the numbers (practice functions and loops)
*
* (done)Create a "Student" class in a new file with a name and an age property, a constructor to set the properties,
* and a method which prints out a sentence using both properties (practice classes, constructors, and concatenation)
*
* */

public class Main {
    int[] array = {0, 90, 10, 29};

    //Hey guys, create your own branch and get started!
    private void oddNumbersTo100(){
        for(int i = 0; i < 100; i++){
            if(i % 2 == 1)
                System.out.println(i);
        }
    }

    private int returnSumOfArrayItems(int[] array){
        int ret = 0;

        for(int i = 0; i < array.length; i++){
            ret += array[i];
        }

        return ret;
    }



    public static void main(String[] args) {

//        Main main = new Main();

//        main.oddNumbersTo100();

//        int sum = main.returnSumOfArrayItems(main.array);
//        System.out.println(sum);

//        Student student = new Student("Vedic", 13);
//        student.printNameAndAge();

    }


}
