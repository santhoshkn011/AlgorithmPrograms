/*
Write static functions to return all permutations of a String using iterative method and
Recursion method. Check if the arrays returned by two string functions are equal.
 */
package com.bridgelabz;

import java.util.Scanner;

public class AlgorithmProblems {
    public static void main (String[]args) {
        System.out.println("Enter your string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length(); //length of the string
        AlgorithmProblems permutation = new AlgorithmProblems(); //Created object
        permutation.permute(str);
    }
    private void permute (String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        permutations(str.toCharArray(), 0);
    }
    //method to permute the string
    private static void permutations(char[] chars, int currentIndex) {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }
        for (int i = currentIndex; i < chars.length; i++) {
            swap(chars, currentIndex, i);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }
    //method to swap
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
