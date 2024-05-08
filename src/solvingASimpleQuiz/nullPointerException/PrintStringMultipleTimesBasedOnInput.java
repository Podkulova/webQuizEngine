package src.solvingASimpleQuiz.nullPointerException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Write a program that reads an integer and a string from the input.
If the integer is greater than 0, print the string that many times.
If the integer is 0 or negative, print "Invalid input!" without throwing any exceptions.

 */
public class PrintStringMultipleTimesBasedOnInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read an integer from the input
        String integerStr = reader.readLine();
        int integer = Integer.parseInt(integerStr);

        // Read a string from the input
        String string = reader.readLine();

        // Check if the integer is greater than 0
        // If so, print the string that many times
        // Otherwise, print "Invalid input!"
        if (integer > 0) {
            for (int i = 0; i < integer; i++) {
                System.out.println(string);
            }
        } else if (integer == 0 || integer < 0) {
            System.out.println("Invalid input!");
        }
    }
}
