package src.declaringMethods;

import java.util.Scanner;

/*
Implement a method sumInRange for calculating the sum of numbers
in the range from (inclusive), to (exclusive). Mind the type of the return value.
*/

public class SumOfNumbersInTheRange {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }

    public static long sumInRange(int from, int to) {
        // write your code here
        long sum = 0;

        for (int i = from; i < to; i++) {
            sum += i;
        }
        return sum;
    }
}
