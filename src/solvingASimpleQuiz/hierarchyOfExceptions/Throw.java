package src.solvingASimpleQuiz.hierarchyOfExceptions;

import java.util.Scanner;

/*
You are given a single integer input.
You need to develop a simple application that treats inputs less than 0 as exceptions
(throw new ArithmeticException()).
 If the value is equal or greater than 0 but less than or equal to 100,
 the program must throw an exception (throw new ArrayIndexOutOfBoundsException()).
 Finally, if the value is greater than 100, the application should print the input.
If an exception occurs, print the exception's name.
 */
public class Throw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        try {
            // user code here
            if (input < 0) {
                throw new ArithmeticException();
            } else if (input <= 100) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                System.out.println(input);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getSimpleName());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
