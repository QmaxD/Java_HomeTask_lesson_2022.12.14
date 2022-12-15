package org.example;

public class Triangle {
    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public Point[] getTriangle() {
        return new Point[]{a, b, c};
    }

    public void setTriangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isoscelesTriangle() {//треугольник равнобедренный?
        if ( (GeometricTools.getLineLength(a, b) == GeometricTools.getLineLength(b, c)) ||
             (GeometricTools.getLineLength(b, c) == GeometricTools.getLineLength(c, a)) ||
             (GeometricTools.getLineLength(c, a) == GeometricTools.getLineLength(a, b)) )
            return true;
        return false;
    }

    public boolean lateralTriangle() {//треугольник разносторонний?
        if ( (GeometricTools.getLineLength(a, b) != GeometricTools.getLineLength(b, c)) &&
             (GeometricTools.getLineLength(b, c) != GeometricTools.getLineLength(c, a)) &&
             (GeometricTools.getLineLength(c, a) != GeometricTools.getLineLength(a, b)) )
            return true;
        return false;
    }

    public boolean equilateralTriangle() {//треугольник равносторонний?
        if ( (GeometricTools.getLineLength(a, b) == GeometricTools.getLineLength(b, c)) &&
                (GeometricTools.getLineLength(b, c) == GeometricTools.getLineLength(c, a)) &&
                (GeometricTools.getLineLength(c, a) == GeometricTools.getLineLength(a, b)) )
            return true;
        return false;
    }

    public boolean rightTriangle() {//треугольник прямоугольный?
        double lineA = (GeometricTools.getLineLength(a, b));
        double lineB = (GeometricTools.getLineLength(b, c));
        double lineC = (GeometricTools.getLineLength(c, a));

        double[] maxLine = GeometricTools.getMaxLine(lineA, lineB, lineC);
        if (Math.pow(maxLine[0], 2) == Math.pow(maxLine[1], 2) + Math.pow(maxLine[2], 2))
            return true;
        return false;
    }

}
