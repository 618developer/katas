package com.developer618;

public class Fizzbuzz {
    public static String printResults(int number) {
        if(number == 3) {
            return "Fizz";
        }
        if(number == 5) {
            return "Buzz";
        }
        if(number == 15) {
            return "Fizzbuzz";
        }
        return Integer.toString(number);
    }
}