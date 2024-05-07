package src.solvingASimpleQuiz.errorsInProgram;

import java.util.Scanner;

/*
Given a program that reads two lines and outputs them in another order.

Now the program cannot compile.

Fix all compile-time errors as well as logic-errors.
 */
public class FixCompileTimeErrors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        System.out.println(line2);
        System.out.println(line1);
    }
}
