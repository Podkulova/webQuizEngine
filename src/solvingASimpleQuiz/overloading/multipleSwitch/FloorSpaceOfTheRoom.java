package src.solvingASimpleQuiz.overloading.multipleSwitch;

import java.util.Scanner;

/*Citizens of the country named Malevia often experiment with the shapes of their rooms.
The rooms can be triangular, rectangular, and round.

Write a program that calculates the floor area of the rooms.

Input data format: The type of the room shape and the relevant parameters.

Output data format: The area of the resulting room.

Note that the value of 3.14 is used instead of the number π in Malevia.*/
public class FloorSpaceOfTheRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose triangle, rectangle, circle: ");
        String input = scanner.nextLine();

        switch (input) {
            case "triangle":
                System.out.println("Write lengths a, b, c: ");
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();

                double s = (a + b + c) / 2;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s -c));

                System.out.println(area);
                break;
            case "rectangle":
                System.out.println("Write lengths a, b: ");
                double a2 = scanner.nextInt();
                double b2 = scanner.nextInt();
                System.out.println(a2 * b2);
                break;
            case "circle":
                System.out.println("Write lengths: ");
                double a3 = scanner.nextInt();
                System.out.println(3.14 * a3 * a3);
                break;
            default:
                System.out.println("Unoknown input");
        }
    }
}
