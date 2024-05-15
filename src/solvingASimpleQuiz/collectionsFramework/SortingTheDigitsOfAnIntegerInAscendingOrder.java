package src.solvingASimpleQuiz.collectionsFramework;

import java.util.*;

/*
Implement a program in Java that takes an integer as input. A
dd a rule to have the program convert that integer into a List with each digit as an element.
Then, use the Collections framework to sort the list in ascending order.
Your program should print the sorted list as the output.
 */
public class SortingTheDigitsOfAnIntegerInAscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Write your code here.
        List<Integer> sortDigits = convertToList(number);
        Collections.sort(sortDigits);
        System.out.println(sortDigits);
    }

    public static List<Integer> convertToList(int number) {
        // Write your code here.
        List<Integer> digits = new ArrayList<>();

        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        return digits;
    }
}
