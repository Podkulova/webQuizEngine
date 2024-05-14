package src.solvingASimpleQuiz.lambdaExpressions;

import java.util.function.IntBinaryOperator;

/*
Write a lambda expression that accepts two integer arguments and returns the maximum of them.

Try not to use the Math library.

Solution format. Submit your lambda expression in any valid format with ";" at the end.

Examples: (x, y) -> x + y; (x) -> { return x; };


 */
public class MaxOfTwoIntegers {
    public static IntBinaryOperator binaryOperator = (x, y) -> x > y ? x : y;
}
