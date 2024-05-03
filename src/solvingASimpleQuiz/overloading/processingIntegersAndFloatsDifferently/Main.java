package src.solvingASimpleQuiz.overloading.processingIntegersAndFloatsDifferently;

import java.util.Scanner;

import static src.solvingASimpleQuiz.overloading.processingIntegersAndFloatsDifferently.Processing.process;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a line of input from the console
        String input = scanner.nextLine();

        try {
            Integer integerInput = Integer.parseInt(input);
            // Call the 'process' method with the integer input and print the result
            System.out.println(process(integerInput));
        } catch (NumberFormatException e) {
            Float floatInput = Float.parseFloat(input);
            // Call the 'process' method with the float input and print the result
            System.out.println(process(floatInput));
        }
    }
}
