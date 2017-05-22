package com.hackerrank.thirtydaysofcode.helloworld;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by sbashar on 11/05/2017.
 */
class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void testEmptyInputString() {
        assertEquals("Hello, World.\n",solution.printResult(""), "Empty input string should return Hello, World. and new line");
    }

    @Test
    public void testValidInputString() {
        assertEquals("Hello, World.\nWelcome to 30 Days of Code!",solution.printResult("Welcome to 30 Days of Code!"), "Valid input string returns Hello, World and the input string");
    }

}