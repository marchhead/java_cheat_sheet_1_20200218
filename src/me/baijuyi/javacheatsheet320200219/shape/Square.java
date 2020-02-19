package me.baijuyi.javacheatsheet320200219.shape;

public final class Square extends Shape {

    private final double a;


    public Square(double a) {
        this.a = a;
        this.area = a*a;
    }
}
