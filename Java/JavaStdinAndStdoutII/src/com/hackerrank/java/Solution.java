package com.hackerrank.java;

import java.util.Scanner;

class Solution {
    void printResult() {
        Scanner scanner = new Scanner(System.in);

        int intInput = Integer.parseInt(scanner.nextLine());
        double doubleInput = Double.parseDouble(scanner.nextLine());
        String stringInput = scanner.nextLine();

        scanner.close();

        System.out.println(formatResult(intInput,doubleInput,stringInput));
    }

    String formatResult(int intInput, double doubleInput, String stringInput) {
        return "String: " + stringInput + "\n" + "Double: " + doubleInput + "\n" + "Int: " + intInput;
    }
}
