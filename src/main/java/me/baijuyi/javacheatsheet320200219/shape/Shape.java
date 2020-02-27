package me.baijuyi.javacheatsheet320200219.shape;

public class Shape implements AreaCalculator, Comparable<Shape> {
    protected double area;

    @Override
    public double calculateArea() {

        return this.area;
    }

    @Override
    public int compareTo(Shape o) {
        if (this.area > o.area) {
            return 1;
        } else if (this.area < o.area) {
            return -1;
        } else {
            return 0;
        }
    }
}
