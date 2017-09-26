package com.hackerrank.java;

import java.util.Scanner;

class Solution {
    void printResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isWeird(scanner.nextInt()));
        scanner.close();
    }

    String isWeird(int n) {
        if( n%2 != 0) {
            return "Weird";
        }

        if(n >= 6 && n <= 20) {
            return "Weird";
        }

        return "Not Weird";
    }
}
