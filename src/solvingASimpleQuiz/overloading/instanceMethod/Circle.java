package src.solvingASimpleQuiz.overloading.instanceMethod;

public class Circle {
    double radius;

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
