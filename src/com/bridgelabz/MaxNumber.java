package com.bridgelabz;

import java.util.Scanner;

public class MaxNumber <T extends Comparable<T>>{
    /*
    T is generic which we givig data type
     */

    public T findMax(T num1 , T num2, T num3) {
        T max = num1;

        if (num2.compareTo(max) > 0) {
            max = num2;
        }

        if (num3.compareTo(max) > 0) {
            max = num3;
        }

        return max;
    }

}