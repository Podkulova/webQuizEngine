package src.solvingASimpleQuiz.interfaces;

/*
The Circle class represents a circle. Implement the Measurable interface and add a single method area that returns the area of a circle.

Note: Java has a built-in constant for PI: Math.PI

The class will be tested by creating an instance of Circle and invoking its area method:

Measurable circle = new Circle(1);
double area = circle.area(); // 3.14...
 */
class Circle implements Measurable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// do not change the interface
interface Measurable {
    double area();
}
