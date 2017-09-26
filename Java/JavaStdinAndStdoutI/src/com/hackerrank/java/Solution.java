package com.hackerrank.java;

import java.util.Scanner;

/**
 * Solution for Java stdin and stdout 1 problem
 */
public class Solution {
    public static void main(String[] args) {
        int input1, input2, input3;

        Scanner scanner = new Scanner(System.in);

        input1 = scanner.nextInt();
        input2 = scanner.nextInt();
        input3 = scanner.nextInt();

        scanner.close();

        System.out.println(printResult(input1,input2,input3));
    }

    static String printResult(int input1, int input2, int input3) {
        return input1 + "\n" + input2 + "\n" + input3;
    }
}
