package src.solvingASimpleQuiz.iteratingOverArrays;

import java.util.Scanner;

/*
Write a program that reads an array of ints and outputs the number of "triples" in the array.

A "triple" is three consecutive ints in increasing order differing by 1
 (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not). Triples may overlap.
 For example, the sequence 1, 2, 3, 4, 5 contains three triples: 1, 2, 3; 2, 3, 4; and 3, 4, 5.

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format

Only a single integer value: the number of "triples".
 */
public class Triples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Načtení velikosti pole
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // Načtení prvků pole
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Počítadlo trojic
        int tripletsCount = 0;

        // Procházení pole a hledání trojic
        for (int i = 0; i < size - 2; i++) {
            if (arr[i + 1] == arr[i] + 1 && arr[i + 2] == arr[i] + 2) {
                tripletsCount++;
            }
        }

        // Výstup počtu trojic
        System.out.println(tripletsCount);
    }
}
