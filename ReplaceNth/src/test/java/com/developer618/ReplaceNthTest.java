package com.developer618;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class ReplaceNthTest {

    @Test
    void solutionTest_2ndOccurence_replaceAwithO() {
        String solution = "Vader soid: No, I am your fother!";
        String original = "Vader said: No, I am your father!";

        assertThat(ReplaceNth.replaceNth(original, 2, 'a', 'o'), is(equalTo(solution)));
    }
}
