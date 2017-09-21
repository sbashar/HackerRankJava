package com.hackerrank.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by sbashar on 21/09/2017.
 */
class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testValidPrintResult() {
        assertEquals("Hello, World.\nHello, Java.", solution.printResult());
    }

}