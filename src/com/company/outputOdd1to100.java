// Create a void method that prints all odd numbers from 0-100 (practice functions and conditions inside loops)

package com.company;

public class outputOdd1to100 {
    static void odd1to100printer(){
        for (int i = 1; i < 101; i++) { //make i run through each number from 1 to 100 once
            if (i % 2 != 0) { //if the remainder of i divided by 2 isn't 0, it's odd, and will be skipped
                System.out.print(i+" ");}}} //print i if passes the if statement
    public static void main(String[] args){
        odd1to100printer();}} //use method

/*
output: 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99
*/