package org.example;

public class StereoPoint extends Point {
    double z;

    public StereoPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    /*public StereoPoint(Point point, double z) {
        super(x, y) = (point.getX(), point.getY());
        this.z = z;
    }*/

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double[] getStereoPoint() {
        return new double[]{x, y, z};
    }

    public void setStereoPoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

}
