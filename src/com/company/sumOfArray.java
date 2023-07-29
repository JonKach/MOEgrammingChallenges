package com.company;

// Create a method that takes an array of numbers as an argument and returns the total of all the numbers (practice functions and loops)

public class sumOfArray {
    static void arraySum(int[] array){
        int sum = 0; //create sum variable with value as 0
        for(int i = 0; i < array.length; i++){ // for as long as the array is:
            sum = sum + array[i];} //add current sum to newest item in array
        System.out.println("sum of given array is: "+sum);} //print out final sum
    public static void main(String[] args){
        int[] testArray = {5,15,7,6,89}; //create test array var to test function/method
        arraySum(testArray);}} // use function/method
