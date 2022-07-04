/*
Two strings are said to be anagram if we can form one string by arranging the characters of another string.

An Anagram Detection Example
a. Desc -> One string is an anagram of another if the second is simply a
rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
c. O/P -> The Two Strings are Anagram or not....
 */
package com.bridgelabz;
import java.util.Scanner;

import java.util.Arrays;

public class AlgorithmProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words to check for anagram.");
        String str1 = sc.next();
        String str2 = sc.next();
//converting to lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // check if length is same
        if(str1.length() == str2.length()) {
            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);
            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }
}
