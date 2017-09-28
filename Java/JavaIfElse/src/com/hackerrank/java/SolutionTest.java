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
    void testOddValueIsWeird() {
        assertEquals("Weird", solution.isWeird(1), "Odd values are Weird");
    }

    @Test
    void testEvenValueBetween2To5IsNotWeird() {
        assertEquals("Not Weird", solution.isWeird(2), "Even values between 2 to 5 are Not Weird so 2 is Not Weird");
    }

    @Test
    void testOddValueBetween2To5IsWeird() {
        assertEquals("Weird", solution.isWeird(5), "Odd values between 2 to 5 are Weird so 5 is Weird");
    }

    @Test
    void testEvenValueBetween6To20IsWeird() {
        assertEquals("Weird", solution.isWeird(6), "Even values between 6 to 20 are Weird so 6 is Weird");
        assertEquals("Weird", solution.isWeird(20), "Even values between 6 to 20 are Weird so 20 is Weird");
    }

    @Test
    void testOddValueBetween6To20IsNotWeird() {
        assertEquals("Weird", solution.isWeird(7), "Odd values between 6 to 20 are Not Weird so 7 is Not Weird");
    }

    @Test
    void testEvenValuesGreaterThan20IsNotWeird() {
        assertEquals("Not Weird", solution.isWeird(22), "Even values greater than 20 are Not Weird so 22 is Not Weird");
    }

    @Test
    void testOddValuesGreaterThan20IsWeird() {
        assertEquals("Weird", solution.isWeird(21), "Odd values greater than 20 are Weird so 21 is Weird");
    }

}