package Abstraction;

abstract class Shape {
    protected double area;
    abstract void calculateArea();

    void displayArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        area = length * width;
    }
}

public class AbstractionShape {
    public static void main(String[] args) {
        Shape shape;
        shape = new Circle(7);
        shape.calculateArea();
        shape.displayArea();

        System.out.println();

        shape = new Rectangle(10, 5);
        shape.calculateArea();
        shape.displayArea();
    }
}
