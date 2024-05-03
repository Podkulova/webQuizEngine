package src.solvingASimpleQuiz.overloading.multipleSwitch;

import java.util.Scanner;

/*Write a Java program that reads a code (1-3) for a
traffic signal and responds with the corresponding color.
Use a switch statement. If the given input is not between 1 and 3,
your program should output 'Invalid'.*/
public class DecodingTrafficSignalColors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose color of the traffic signal: ");
        int color = scanner.nextInt();

        switch (color) {
            case 1:
                System.out.println("Green");
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 3:
                System.out.println("Red");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
