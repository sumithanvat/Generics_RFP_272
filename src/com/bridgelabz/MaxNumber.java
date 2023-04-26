// Refactor 1
package com.bridgelabz;

public class MaxNumber <T extends Comparable<T>>{
    /*
    T is generic which we givig data type
     */
// we create a method to check maximum between 3 numbers

    public T findMax(T x, T y, T z) {
        T max = x; // assume x is initially the largest
        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far
        }
        if (z.compareTo(max) > 0) {
            max = z; // z is the largest now
        }
        return max; // returns the largest object
    }
}