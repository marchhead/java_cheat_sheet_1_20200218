package me.baijuyi.javacheatsheet320200219.shape;

public final class Rectangle extends Shape {
    private final double a;
    private final double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.area = a * b;
    }

}
