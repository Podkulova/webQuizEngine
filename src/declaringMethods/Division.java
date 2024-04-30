package src.declaringMethods;

import java.util.Scanner;

/*To perform math division, you have the method named divide that takes two long numbers and returns a double value.

Write a body of the method. It should return the result of the division of the first argument by the second one.
It's guaranteed that the second argument is not equal to zero.*/
public class Division {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }

    public static double divide(long a, long b) {
        if (b == 0) {
            System.out.println("You cannot divide by zero.");
        }
        return (double) a / b;
    }
}
