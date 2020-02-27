package me.baijuyi.javacheatsheet320200219.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(100.9);
        Shape rectangle = new Rectangle(2.9, 3.9);
        Shape square = new Square(400);

        System.out.println(circle.compareTo(rectangle));
        System.out.println(circle.compareTo(square));
    }
}
