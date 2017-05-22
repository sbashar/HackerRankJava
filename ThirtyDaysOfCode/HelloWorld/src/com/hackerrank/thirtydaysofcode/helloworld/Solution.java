package com.hackerrank.thirtydaysofcode.helloworld;

import java.util.Scanner;

/**
 * Created by sbashar on 11/05/2017.
 */
class Solution {

    private String inputString;

    public String printResult(String inputString) {
        this.inputString = inputString;
        return "Hello, World.\n" + inputString;
    }
}
