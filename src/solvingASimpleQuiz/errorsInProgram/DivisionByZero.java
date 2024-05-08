package src.solvingASimpleQuiz.errorsInProgram;

public class DivisionByZero {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("You cant divided by zero.");
        }
    }
}
