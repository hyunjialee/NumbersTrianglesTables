package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        StringBuilder s = new StringBuilder();

        // Declares Counter called i; iterate for loop as long as condition is true; increments i;
        for (int i = 1; i < numberOfRows; i++) {
            s.append(TriangleUtilities.getRow(i));
            s.append('\n');
            System.out.print(s);

        }
        return s.toString();
    }

    public static String getRow(int numberOfStars) {

        //creates an empty builder w/ capacity of 16
        StringBuilder s = new StringBuilder();

        //loops through and adds the string "*"
        for (int i = 0; i < numberOfStars; i++) {
            s.append("*");
        }

        return s.toString(); //converts StringBuilder to String type
    }

    public static String getSmallTriangle() {

        System.out.print(TriangleUtilities.getTriangle(5));

        return TriangleUtilities.getTriangle(5);
    }

    public static String getLargeTriangle() {
        return TriangleUtilities.getTriangle(10);
    }
}
//added commit