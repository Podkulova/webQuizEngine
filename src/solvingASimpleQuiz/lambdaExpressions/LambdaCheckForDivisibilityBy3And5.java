package src.solvingASimpleQuiz.lambdaExpressions;

import java.util.Scanner;
import java.util.function.IntPredicate;

/*
Write a lambda expression that takes an integer n as input and returns true if n is divisible by both 3 and 5,
 and false otherwise. Scan the input integer n from the console and print the result of applying the lambda expression to n.
 */
public class LambdaCheckForDivisibilityBy3And5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Write a lambda expression that checks if n is divisible by both 3 and 5
        IntPredicate isDivisibleBy3And5 = (number) -> number % 3 == 0 && number % 5 == 0;

        System.out.println(isDivisibleBy3And5.test(n));
    }
}
