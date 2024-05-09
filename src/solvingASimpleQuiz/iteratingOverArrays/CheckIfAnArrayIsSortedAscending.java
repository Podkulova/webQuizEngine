package src.solvingASimpleQuiz.iteratingOverArrays;

import java.util.Scanner;

/*
Write a program that reads an array of int's and checks if the array is sorted ascending (from smallest to largest number).

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format

Only a single value: true or false.
 */
public class CheckIfAnArrayIsSortedAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        boolean sorted = true;

        for (int i = 1; i < size; i++) {
            if (array[i] < array[i - 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
    }
}
