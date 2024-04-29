package src.forLoop;

import java.util.Scanner;

public class IntegerBarrier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();

            if (number == 0 || sum >= 1000) {
                break;
            }
            sum += number;
        }
        if (sum >= 1000) {
            System.out.println("Sum is: " + (sum - 1000));
        } else {
            System.out.println("Sum is: " + sum);
        }
    }
}
