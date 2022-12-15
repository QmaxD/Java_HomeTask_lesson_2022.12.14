package org.example;

import java.util.Arrays;

public class GeometricTools {

    public static double getLineLength(Point begin, Point end) {
        double tempLine1 = (end.getX() - begin.getX() );
        double tempLine2 = (end.getY() - begin.getY() );
        double result = Math.sqrt( Math.pow(tempLine1, 2) + Math.pow(tempLine2, 2) );
        return result;
    }

    public static double getLineLength(double beginX, double beginY, double endX, double endY) {
        double tempLine1 = (endX - beginX);
        double tempLine2 = (endY - beginY);
        double result = Math.sqrt( Math.pow(tempLine1, 2) + Math.pow(tempLine2, 2) );
        return result;
    }

    public static double[] getMaxLine(double lineA, double lineB, double lineC) {
        double[] sortLines = new double[]{lineA, lineB, lineC};
        Arrays.stream(sortLines).sorted();
        for (int i = 0; i < sortLines.length; i++)
            System.out.println("Отсортировали: " + sortLines[i]);
        return sortLines;
    }

}
