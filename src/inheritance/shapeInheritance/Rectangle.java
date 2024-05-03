package src.inheritance.shapeInheritance;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}
