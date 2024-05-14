package src.solvingASimpleQuiz.lambdaExpressions;

import java.util.function.LongBinaryOperator;

/*
Write a lambda expression that accepts two long arguments as a range's borders and calculates
(returns) the product of all numbers in this range (inclusively). It's guaranteed that 0 <= left
border <= right border. If left border == right border, then the result is any border.

Solution format. Submit your lambda expression in any valid format with ; at the end.

Examples: (x, y) -> x + y; (x, y) -> { return x + y; };
 */
public class ProductionOfAllNumbersInTheRange {
    public static LongBinaryOperator binaryOperator = (x, y) -> {
        long result = 1;
        for (long i = x; i <= y; i++) {
            result *= i;
        }
        return result;
    };
}
