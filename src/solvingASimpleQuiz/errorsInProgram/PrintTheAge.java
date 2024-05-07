package src.solvingASimpleQuiz.errorsInProgram;

import java.util.Scanner;

/*
Here's a program that reads an integer age and outputs a string with this integer.
But something is broken in the code!

Fix all compile-time errors in the snippet and make it work.
 */

public class PrintTheAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        System.out.printf("My age is %d", age);
    }
}
