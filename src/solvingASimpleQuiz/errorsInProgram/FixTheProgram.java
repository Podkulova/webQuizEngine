package src.solvingASimpleQuiz.errorsInProgram;

import java.util.Scanner;

/*
You are given a program that should read three strings, concatenate them and output the result.

For some reason, the program doesn't compile.

Fix all compile-time errors as well as logic-errors.
 */
public class FixTheProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();

        System.out.println(a + b + c);
    }
}
