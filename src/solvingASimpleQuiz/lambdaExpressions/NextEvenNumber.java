package src.solvingASimpleQuiz.lambdaExpressions;

import java.util.Scanner;
import java.util.function.LongUnaryOperator;

/*
Write a lambda expression that accepts a long value and returns the next even number.

It is guaranteed that the input number is non-negative.

Solution format. Submit your lambda expression in any valid format with ; at the end.

Examples: x -> x; (x) -> x; (x) -> { return x; };
 */
public class NextEvenNumber {
    public static void main(String[] args) {
        System.out.println(unaryOperator);
    }

    public static LongUnaryOperator unaryOperator = x -> x % 2 == 0 ? x + 2 : x + 1;
}
