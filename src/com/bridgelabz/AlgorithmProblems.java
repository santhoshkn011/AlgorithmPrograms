/*
Bubble Sort
a. Desc -> Reads in integers prints them in sorted order using Bubble Sort
b. I/P -> read in the list ints
c. O/P -> Print the Sorted List
 */
package com.bridgelabz;

public class AlgorithmProblems {
    //Bubble sort method
    public static void bubbleSort(int [] sort_arr, int len){
        for (int i=0;i<len-1;++i){
            for(int j=0;j<len-i-1; ++j){
                if(sort_arr[j+1]<sort_arr[j]){
                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;
                }
            }
        }
    }
    public static void main( String args[] ) {
        int [] array = {5, 11, 6, 3, 22, 99, 110};
        int len = array.length; //length of the array
        bubbleSort(array,len); //calling the method

        for(int i = 0; i<len; ++i){
            System.out.print(array[i] + " ");
        }
    }
}
