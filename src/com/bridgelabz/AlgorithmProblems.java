/*
Binary Search the Word from Word List
a. Desc -> Read in a list of words from File. Then prompt the user to enter a word to
search the list. The program reports if the search word is found in the list.
b. I/P -> read in the list words comma separated from a File and then enter the word
to be searched
c. Logic -> Use Arrays to sort the word list and then do the binary search
d. O/P -> Print the result if the word is found or not
 */
package com.bridgelabz;

public class AlgorithmProblems {
    static String[] a = { "AB", "BC", "CD", "DE", "EF", "FG", "." };
    static int min = 0;
    static int max = a.length - 1;
    static int mid;
    static String key = "EF";
    //main method
    public static void main (String[]args){
        System.out.println("Key Found at : " + stringBinarySearch() + " position");
    }
    public static int stringBinarySearch () {
        while (min <= max) {
            mid = (min + max) / 2;
            if (a[mid].compareTo(key) < 0) {
                min = mid + 1;
            } else if (a[mid].compareTo(key) > 0) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
