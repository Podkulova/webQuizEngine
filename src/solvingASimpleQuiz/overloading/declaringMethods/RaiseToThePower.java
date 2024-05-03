package src.solvingASimpleQuiz.overloading.declaringMethods;

import java.util.Scanner;

/*
You're given the method power that takes two int numbers n and m.
The method should return the value of nm as a long value.
*/

public class RaiseToThePower {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));

    }

    public static long power(int n, int m) {
        return (long) Math.pow(n, m);
    }
}
