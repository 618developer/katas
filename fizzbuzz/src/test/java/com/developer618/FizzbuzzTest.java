package com.developer618;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class FizzbuzzTest {

    private int getRandomNumber(int min, int max, int divisibleBy) {
        return (int)((Math.random() * (max - min)) + min) * divisibleBy;
    }

    //First Set of tests
    @Test
    public void printNumberNotDividedBy3Or5() {
        assertThat(Fizzbuzz.printResults(1), is(equalTo("1")));
    }

    @Test
    public void printFizzForNumberDivideBy3() {
        assertThat(Fizzbuzz.printResults(3), is(equalTo("Fizz")));
    }

    @Test
    void printBuzzForNumberDividedBy5() {
        assertThat(Fizzbuzz.printResults(5), is(equalTo("Buzz")));
    }

    @Test
    void printFizzBuzzForNumberDividedBy3And5() {
        assertThat(Fizzbuzz.printResults(15), is(equalTo("Fizzbuzz")));
    }

    //Second set of tests that drove the algorithm to have the % used
    @Test
    void printFizzForAnyRandomNumberDividedBy3() {
        assertThat(Fizzbuzz.printResults(getRandomNumber(1,4,3)), is(equalTo("Fizz")));
    }

    @Test
    void printBuzzForAnyRandomNumberDividedByOnly5() {
        assertThat(Fizzbuzz.printResults(getRandomNumber(10,11,5)), is(equalTo("Buzz")));
    }

    @Test
    void printFizzBuzzForAnyRandomNumberDividedByOnly15() {
        assertThat(Fizzbuzz.printResults(getRandomNumber(1, 6, 15)), is(equalTo("Fizzbuzz")));
    }
}