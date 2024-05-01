package src.arraysAsParameters;

import java.util.Arrays;

public class PrintArray2 {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6};

        method(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public static void method(int[] array) {
        array = new int[]{1, 2, 3};
    }
}
