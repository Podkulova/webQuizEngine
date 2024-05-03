package src.solvingASimpleQuiz.overloading.forLoop;

import java.util.Scanner;

public class CountOfNumbersDivisibleByN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three positive integers separated by spaces (a b n): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                count++;
            }
        }

        System.out.println("The count of numbers divisible by " + n + " in the range from " + a + " to " + b + " is: " + count);

        scanner.close();
    }
}
