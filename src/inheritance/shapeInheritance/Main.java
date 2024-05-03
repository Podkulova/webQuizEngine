package src.inheritance.shapeInheritance;

import java.util.Scanner;

/*
Create a base class called Shape with a constructor that takes the shape's name as a parameter.
Then create a derived class called Rectangle that inherits from Shape and adds a constructor which
takes the rectangle's length and width as parameters, as well as a method to calculate the rectangle's area.
 Create an instance of the Rectangle class, passing the name, length, and width to the constructor.
  Print the rectangle's name and area.

 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the rectangle's name, length, and width from the user
        System.out.println("Enter the rectangle's name:");
        String name = scanner.nextLine();

        System.out.println("Enter the rectangle's length:");
        double length = scanner.nextDouble();

        System.out.println("Enter the rectangle's width:");
        double width = scanner.nextDouble();

        // Create an instance of the Rectangle class
        Rectangle rectangle = new Rectangle(name, length, width);

        // Print the rectangle's name and area
        System.out.println("Rectangle name: " + rectangle.getName());
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}
