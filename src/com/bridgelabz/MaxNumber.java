package com.bridgelabz;

import java.util.Scanner;

public class MaxNumber <T extends Comparable<T>>{
    /*
    T is generic which we givig data type
     */
// we create a method to check maximum between 3 numbers

    public T findMax(T word1 , T word2, T word3) { // with help of .compare
        T max = word1;

        if (word2.compareTo(max) > 0) {
            max = word2;
        }

        if (word3.compareTo(max) > 0) {
            max = word3;
        }

        return max;
    }

}