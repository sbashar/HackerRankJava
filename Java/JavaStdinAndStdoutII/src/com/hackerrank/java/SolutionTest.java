package com.hackerrank.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testTheCorrectFormatdResultIsReturned() {
        assertEquals("String: test\nDouble: 3.14\nInt: 13", solution.formatResult(13, 3.14, "test"), "Result displays the information correctly");
    }

}