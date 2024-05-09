package src.solvingASimpleQuiz.iteratingOverArrays;

import java.util.Scanner;

/*
Write a program that reads an array of ints and an integer number n.
The program must sum all the array elements greater than n.

Input data format

The first line contains the size of an array.
The second line contains the elements of the array separated by spaces.
The third line contains the number n.
 */
public class SuArrayElementsGreaterThanAvalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Načtení velikosti pole
        int size = scanner.nextInt();

        // Vytvoření pole
        int[] array = new int[size];

        // Načtení prvků pole
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Načtení čísla n
        int n = scanner.nextInt();

        // Sečtení prvků pole větších než n
        int sum = 0;
        for (int num : array) {
            if (num > n) {
                sum += num;
            }
        }

        // Výstupní součet
        System.out.println(sum);
    }
}
