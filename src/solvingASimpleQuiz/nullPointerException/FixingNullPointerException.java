package src.solvingASimpleQuiz.nullPointerException;

import java.util.Scanner;

/*
Here's a program that may throw NullPointerException. Fix it to avoid the exception.

In the case when the exception may occur, the program should print the string "NPE!".
 */
public class FixingNullPointerException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        string = "null".equals(string) ? null : string;
        /* Do not change code above */

        if (string == null) {
            System.out.println("NPE!");
        } else {
            System.out.println(string.toLowerCase());
        }
    }
}
