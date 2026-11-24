package com.cloudheroes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class GradeCalculatorTest {

    private final GradeCalculator calculator = new GradeCalculator();

    @Test
    void averageIsComputedCorrectly() {
        assertEquals(80.0, calculator.average(new int[]{70, 80, 90}));
    }

    @Test
    void emptyScoresAreRejected() {
        assertThrows(IllegalArgumentException.class, () -> calculator.average(new int[]{}));
    }

    @Test
    void letterGradesMatchTheScale() {
        assertEquals("A", calculator.letterGrade(85));
        assertEquals("C", calculator.letterGrade(65));
        assertEquals("F", calculator.letterGrade(30));
    }
}
