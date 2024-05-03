package src.solvingASimpleQuiz.overloading.arraysAsParameters;

import java.util.Arrays;

public class PrintCode {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6};

        method(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public static void method(int[] array) {
        if (array.length >= 3) {
            array[0] = 1;
            array[1] = 2;
            array[2] = 3;
        }
    }
}
