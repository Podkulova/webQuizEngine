package src.solvingASimpleQuiz.lambdaExpressions;

import java.util.function.DoubleUnaryOperator;

/*
Using closure write a lambda expression that calculates
𝑎∗𝑥2 + 𝑏∗𝑥 + 𝑐
 where a, b, c are context final variables. They will be available in the context during testing. Note, the result is double.

Solution format. Submit your lambda expression in any valid format with ; on the end.

Examples: (x, y) -> x + y; (x, y) -> { return x + y; }


 */
public class ExpressionClosure {
    public static int a = 10;
    public static int b = 20;
    public static int c = 30;

    public static DoubleUnaryOperator unaryOperator = x -> a * x * x + b * x + c;
}
