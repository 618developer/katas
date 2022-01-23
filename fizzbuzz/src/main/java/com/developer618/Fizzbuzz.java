package com.developer618;

public class Fizzbuzz {
    public static String printResults(int number) {
        if (number % 15 == 0) {
            return "Fizzbuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
