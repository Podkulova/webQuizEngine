package src.functionalDecomposition;

import java.util.Scanner;

/*
A quadratic equation is an algebraic equation of degree two. It's easy to solve this equation
when you know the quadratic formula.

Here is a simple program for calculating the real roots of a quadratic equation:
What if we change it a bit by decomposing this code and creating additional methods? That's what we get then:
*/

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double discriminant = calculateDiscriminant(a, b, c);

        if (discriminant < 0) {
            System.out.println("No real roots!");
        } else {
            calculateRoots(a, b, c, discriminant);
        }
    }

    public static double calculateDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static void calculateRoots(double a, double b, double c, double discriminant) {
        double x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
        double x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
        if (x1 == x2) {
            System.out.println("x = " + x1);
        } else {
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
