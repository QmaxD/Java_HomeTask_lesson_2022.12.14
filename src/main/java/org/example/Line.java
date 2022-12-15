package org.example;

public class Line {
    Point begin;
    Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point[] getLine() {
        return new Point[]{begin, end};
    }

    public void setLine(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public double getLineLength() {
        double tempLine1 = (end.getX() - begin.getX() );
        double tempLine2 = (end.getY() - begin.getY() );
        double result = Math.sqrt( Math.pow(tempLine1, 2) + Math.pow(tempLine2, 2) );
        return result;
    }

}
