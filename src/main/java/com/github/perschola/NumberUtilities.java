package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        return getRange(start%2 == 0 ? start : start+1, stop, 2);
    }


    public static String getOddNumbers(int start, int stop) {
        return getRange(start%2 != 0 ? start : start+1, stop, 2);
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start,stop,step,2);
    }

    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 1);
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < stop; i+=step) {
            result.append(Double.valueOf(Math.pow(i,exponent)).intValue());
        }
        return result.toString();
    }
}
