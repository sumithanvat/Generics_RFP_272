package com.bridgelabz;

import java.util.*;


public class MaximumFinder<T extends Comparable<T>> {


    public static <T extends Comparable<T>> T max(T[] values) {
        T max = null;
        if (values != null && values.length > 0) {
            max = values[0];
            for (int i = 1; i < values.length; i++) {
                if (values[i].compareTo(max) > 0) {
                    max = values[i];
                }
            }
        }
        printMax(max);
        return max;
    }

    private static <T> void printMax(T max) {
        System.out.println("Maximum element: " + max);
    }
}