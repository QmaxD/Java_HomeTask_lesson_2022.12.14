package org.example;

public class Square {
    Point a;
    Point b;
    Point c;
    Point d;

    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    public Point[] getTriangle() {
        return new Point[]{a, b, c, d};
    }

    public void setTriangle(Point a, Point b, Point c, Point d) {
        if (isSquare(a, b, c, d)) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        else
            System.out.println("Это не квадрат!");
    }

    public boolean isSquare(Point a, Point b, Point c, Point d) {
        if (
            (GeometricTools.getLineLength(a, b) == GeometricTools.getLineLength(b, c)) &&
            (GeometricTools.getLineLength(b, c) == GeometricTools.getLineLength(c, d)) &&
            (GeometricTools.getLineLength(c, d) == GeometricTools.getLineLength(d, a)) &&
            (GeometricTools.getLineLength(d, a) == GeometricTools.getLineLength(a, b)) &&
            (GeometricTools.getLineLength(a, c) == GeometricTools.getLineLength(b, d))
        )
            return true;
        return false;
    }

    public boolean isSquare() {
        if (
            (GeometricTools.getLineLength(a, b) == GeometricTools.getLineLength(b, c)) &&
            (GeometricTools.getLineLength(b, c) == GeometricTools.getLineLength(c, d)) &&
            (GeometricTools.getLineLength(c, d) == GeometricTools.getLineLength(d, a)) &&
            (GeometricTools.getLineLength(d, a) == GeometricTools.getLineLength(a, b)) &&
            (GeometricTools.getLineLength(a, c) == GeometricTools.getLineLength(b, d))
        )
            return true;
        return false;
    }

    public double getSquareArea() {
        return Math.pow(GeometricTools.getLineLength(a, b), 2);
    }

}
