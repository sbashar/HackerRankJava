package com.hackerrank.thirtydaysofcode.helloworld;

import java.util.Scanner;

/**
 * Created by sbashar on 11/05/2017.
 *  Solution for https://www.hackerrank.com/challenges/30-hello-world
 */
public class HelloWorld {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();
        System.out.println(solution.printResult(inputString));
    }
}
