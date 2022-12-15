package org.example;
import java.util.List;

public class Cube {
    List<StereoPoint> points;

    public Cube(List<StereoPoint> points) {
        if (points.size() == 8)
            this.points = points;
        else
            System.out.println("Error: В кубе должно быть 8 точек!");
    }

    public List<StereoPoint> getPoints() {
        return points;
    }

    public void setPoints(List<StereoPoint> points) {
        if (points.size() == 8)
            this.points = points;
        else
            System.out.println("Error: В кубе должно быть 8 точек!");
    }

    public double getCubeArea() {
        double diagonal = GeometricTools.getLineLength(points.get(0), points.get(2));
        System.out.println("Диагональ = " + diagonal);
        double cubeArea = Math.pow( diagonal / Math.sqrt(2) , 3);
        return cubeArea;
    }

}
