/*
Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
 */
package com.bridgelabz;
public class AlgorithmProblems {
    //Main method
    public static void main (String[]args) {
        int lower = 0, upper = 1000; //range from 0 to 1000
        for (int i = lower; i <= upper; i++)
            if (isPrime (i))
                System.out.println (i);
    }
    //Method to check prime
    static boolean isPrime (int n) {
        int count = 0;
        // 0, 1 negative numbers are not prime
        if (n < 2)
            return false;
        // checking the number of divisors b/w 1 and the number n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        // if the number is prime
        return true;
    }
}
