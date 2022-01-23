package com.developer618;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class ReplaceNthTest {

    private final String originalText = "Vader said: No, I am your father!";

    @DisplayName("Let's handle the 0 for n first, original value returned")
    @Test
    void handleZeroPassedIn() {
        // Arrange

        // Act
        // Assert
        assertThat(ReplaceNth.replaceNth(originalText, 0, 'a', 'o'), is(equalTo(originalText)));
    }

    @DisplayName("If n is negative, original value returned")
    @Test
    void handleNegativeNPassedIn() {
        // Arrange
        // Act
        // Assert
        assertThat(ReplaceNth.replaceNth(originalText, -1, 'a', 'o'), is(equalTo(originalText)));
    }

    @DisplayName("N being 1 will replace every occurence.")
    @Test
    void handleNBeing1_replaceAllAsWithB() {
        // Arrange
        String replaceAllAsSolution = "Vbder sbid: No, I bm your fbther!";
        // Act
        // Assert
        assertThat(ReplaceNth.replaceNth(originalText, 1, 'a', 'b'), is(equalTo(replaceAllAsSolution)));
    }

    @Test
    void solutionTest_2ndOccurence_replaceAwithO() {
        String solution = "Vader soid: No, I am your fother!";

        assertThat(ReplaceNth.replaceNth(originalText, 2, 'a', 'o'), is(equalTo(solution)));
    }
}
