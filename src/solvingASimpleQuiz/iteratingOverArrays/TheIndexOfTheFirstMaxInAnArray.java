package src.solvingASimpleQuiz.iteratingOverArrays;

import java.util.Scanner;

/*
Write a program that reads an array of ints and finds the index of the first maximum in that array.

Input data format

The first line contains the number of elements in the array.

The second line contains the array elements separated by spaces.

An array always has at least one element.

Output data format

Only a single integer value: the index of the first maximum.
 */
public class TheIndexOfTheFirstMaxInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Načtení počtu prvků v poli
        int size = scanner.nextInt();

        // Inicializace proměnných pro index prvního maxima a hodnoty maxima
        int maxIndex = 0;
        int maxValue = scanner.nextInt();

        // Načtení prvků pole a hledání prvního maxima
        for (int i = 1; i < size; i++) {
            int current = scanner.nextInt();
            if (current > maxValue) {
                maxValue = current;
                maxIndex = i;
            }
        }

        // Výstup indexu prvního maxima
        System.out.println(maxIndex);

    }
}
