package src.constructor.geometricCube;

import java.util.Scanner;

/*
You have a class GeometricCuboid with a 3-argument constructor:

public GeometricCuboid(int width, int height, int length)

Write a program that reads width, height and length, creates an
 instance named cuboid and outputs the result of cuboid.toString().

Use the provided template, do not change it!
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int length = scanner.nextInt();

        // creating an instance
        GeometricCuboid cuboid = new GeometricCuboid(width,height,length);

        System.out.println(cuboid.toString());
    }

}
