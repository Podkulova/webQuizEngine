package src.solvingASimpleQuiz.iteratingOverArrays;

import java.util.Arrays;
import java.util.Scanner;

/*
A right rotation is an operation that shifts each element of an array to the right.
For example, if an array is {1,2,3,4,5} and we right rotate it by 1, the new array will be {5,1,2,3,4}.
If we rotate it by 2, the new array will be {4,5,1,2,3}. It goes like this: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.

Implement rotate method that performs a right rotation on an array by a given number.

Note that If your solution gets the code quality warning "System.arraycopy is more efficient",
 please simply ignore it for this code challenge.
 */
public class RightRotation {
    // implement me
    private static void rotate(int[] arr, int steps) {
        // Počet prvků v poli
        int length = arr.length;

        // Normalizace počtu kroků
        steps %= length;

        // Pokud jsou počet kroků kladné, provedeme rotaci
        if (steps > 0) {
            // Vytvoření pomocného pole
            int[] temp = new int[length];

            // Kopírování prvků od posledního k prvnímu
            System.arraycopy(arr, length - steps, temp, 0, steps);

            // Kopírování zbývajících prvků
            System.arraycopy(arr, 0, temp, steps, length - steps);

            // Kopírování prvků z pomocného pole zpět do původního pole
            System.arraycopy(temp, 0, arr, 0, length);
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
