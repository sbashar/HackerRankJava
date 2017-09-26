package com.hackerrank.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testPrintResult() {
        assertEquals("42\n100\n125", Solution.printResult(42,100,125), "Valid integer input should provide a valid formatted output.");
    }

}