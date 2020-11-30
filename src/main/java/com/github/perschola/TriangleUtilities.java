package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
            result.append(getRow(i)).append("\n");
        }
        return result.toString();
    }

    public static String getRow(int numberOfStars) {
        return new String(new char[numberOfStars]).replaceAll("\u0000", "*");
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
