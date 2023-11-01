package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSi5ze) {
        StringBuilder s = new StringBuilder();

        for (int i = 1; i <= tableSi5ze; i++) {
            for (int j = 1; j <= tableSi5ze; j++) {
                s.append(String.format("%3d |", i * j));
            }
            // % - prints variable
            // 3 - use 3 characters to display, filling in spaces
            // d - the variable is of type int
            s.append("\n");
        }
        return s.toString();
    }
}