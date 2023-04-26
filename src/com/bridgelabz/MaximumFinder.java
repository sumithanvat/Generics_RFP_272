package com.bridgelabz;

import java.util.*;


public class MaximumFinder<T extends Comparable<T>> {

    public static int max(int... values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }

    public static double max(double... values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }

    public static String max(String... values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }

}
