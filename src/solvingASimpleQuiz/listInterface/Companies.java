package src.solvingASimpleQuiz.listInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
You're given a sequence of strings separated by spaces.
Read the sequence from the standard input and store all strings in a list. Output the list to the standard output using System.out.println(yourList).

The order of elements must be the same as in the input.
 */
public class Companies {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String inputSequence = scanner.nextLine();

        List<String> stringList = Arrays.asList(inputSequence.split(" "));

        System.out.println(stringList);
    }
}

