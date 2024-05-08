package src.solvingASimpleQuiz.exceptionHandling;

public class MethodNamedProcess {
    public static void main(String[] args) {
        try {
            process("");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    static void process(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }
        // Other processing logic here
    }
}
