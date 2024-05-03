package src.solvingASimpleQuiz.overloading.arraysAsParameters;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a method named addValueByIndex.

The method should take an array of longs and add a value to the specified element by its index.

Here is a description of the parameters:

an array of longs;
the index of an element (int);
a value for adding (long).
The method must return nothing.

The following invocation should work correctly:
addValueByIndex(array, index, value);
 */
public class AddingValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();

        int index = scanner.nextInt();
        long value = scanner.nextLong();

        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }

    public static void addValueByIndex(long[] array, int index, long values) {
        array[index] += values;
    }

}
