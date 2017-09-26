package com.hackerrank.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by sbashar on 21/09/2017.
 */
class SolutionTest {
    @Test
    void testValidPrintResult() {
        assertEquals("Hello, World.\nHello, Java.", Solution.printResult(), "printResult should print the output string in the specified format");
    }

}