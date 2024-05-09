package src.solvingASimpleQuiz.iteratingOverArrays;

import java.util.Arrays;

public class Pr1 {
    public static void main(String[] args) {
        int n = 10; // the size of an array
        int[] squares = new int[n]; // creating an array with the specified size

        System.out.println(Arrays.toString(squares)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        /* iterating over the array */
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i; // set the value by the element index
        }

        System.out.println(Arrays.toString(squares)); // [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
    }
}
