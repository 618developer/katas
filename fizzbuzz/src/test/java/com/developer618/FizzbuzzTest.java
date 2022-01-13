package com.developer618;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class FizzbuzzTest {

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
}