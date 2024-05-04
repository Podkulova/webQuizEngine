package src.solvingASimpleQuiz.multipleConstructors;

public class Circle {
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public Circle() {
        this.radius = 1.0;
    }

    public String toString() {
        return "Circle with radius " + radius;
    }
}
