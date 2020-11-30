package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder result = new StringBuilder();
        for (int column = 1; column <= tableSize; column++) {
            for (int row = 1; row <= tableSize; row++) {
                int product = column * row;
                result.append(String.format("%3d |", product));
            }
            result.append("\n");
        }
        return result.toString();
    }
}
