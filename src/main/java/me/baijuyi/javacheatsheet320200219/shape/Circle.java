package me.baijuyi.javacheatsheet320200219.shape;

public final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

}
