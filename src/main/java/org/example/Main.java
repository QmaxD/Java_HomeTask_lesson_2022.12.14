package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Point point01 = new Point(1.0, 1.0);
        Point point02 = new Point(5.0, 2.0);
        Line line01 = new Line(point01, point02);
        System.out.println("Длина линии: " + line01.getLineLength());

        Point point03 = new Point(5.0, 1.0);
        Triangle triangle01 = new Triangle(point01, point02, point03);
        System.out.println("Треугольник прямоугольный? " + triangle01.rightTriangle());
        System.out.println("Треугольник равносторонний? " + triangle01.isoscelesTriangle());

        Point point04 = new Point(1.0, 1.0);
        Point point05 = new Point(1.0, 3.0);
        Point point06 = new Point(3.0, 3.0);
        Point point07 = new Point(3.0, 1.0);
        Square square01 = new Square(point04, point05, point06, point07);
        System.out.println("Это квадрат? " + square01.isSquare());
        System.out.println("Площадь квадрата = " + square01.getSquareArea());

        // Куб
        //StereoPoint stereoPoint00 = new StereoPoint()

        StereoPoint stereoPoint01 = new StereoPoint(1.0, 1.0,0.0);
        StereoPoint stereoPoint02 = new StereoPoint(1.0, 3.0,0.0);
        StereoPoint stereoPoint03 = new StereoPoint(3.0, 3.0,0.0);
        StereoPoint stereoPoint04 = new StereoPoint(3.0, 1.0,0.0);
        StereoPoint stereoPoint05 = new StereoPoint(1.0, 1.0,5.0);
        StereoPoint stereoPoint06 = new StereoPoint(1.0, 3.0,5.0);
        StereoPoint stereoPoint07 = new StereoPoint(3.0, 3.0,5.0);
        StereoPoint stereoPoint08 = new StereoPoint(3.0, 1.0,5.0);
        List<StereoPoint> list = new ArrayList<>();
        list.add(stereoPoint01);
        list.add(stereoPoint02);
        list.add(stereoPoint03);
        list.add(stereoPoint04);
        list.add(stereoPoint05);
        list.add(stereoPoint06);
        list.add(stereoPoint07);
        list.add(stereoPoint08);
        Cube cube01 = new Cube(list);
        System.out.println("Объем куба = " + cube01.getCubeArea());

    }
}