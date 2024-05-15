package src.solvingASimpleQuiz.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
mplement a method to concatenate all positive numbers of two input ArrayLists to a single resulting list.

At first, elements from the first ArrayList should go, and then the elements from the second ArrayList.
 */
public class ConcatPositiveNumbers {
    public static ArrayList<Integer> concatPositiveNumbers(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> result = new ArrayList<>();

        // Add positive numbers from the first list
        for (Integer num : l1) {
            if (num > 0) {
                result.add(num);
            }
        }

        // Add positive numbers from the second list
        for (Integer num : l2) {
            if (num > 0) {
                result.add(num);
            }
        }

        return result;
    }


    /* Do not modify this method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = readArrayList(scanner);
        ArrayList<Integer> list2 = readArrayList(scanner);

        ArrayList<Integer> result = concatPositiveNumbers(list1, list2);

        result.forEach(n -> System.out.print(n + " "));
    }

    /* Do not modify this method */
    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
