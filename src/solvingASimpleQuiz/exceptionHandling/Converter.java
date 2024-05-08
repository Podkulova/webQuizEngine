package src.solvingASimpleQuiz.exceptionHandling;

/*
Consider a method that takes a string and converts it to a double.
If the input string happens to be null or of an unsuitable format, a runtime exception
occurs and the program fails.

Fix the method so it would catch any exception and return the default value 0 (zero)
if an exception occurred.
 */
public class Converter {
    public static double convertStringToDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException | NullPointerException e) {
            return 0.0;
        }
    }
}
