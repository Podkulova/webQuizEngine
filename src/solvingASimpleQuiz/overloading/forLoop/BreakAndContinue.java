package src.solvingASimpleQuiz.overloading.forLoop;

import java.util.Scanner;

/*You have an incomplete program that should display all positive numbers divisible by 4,
that are less than the number entered by the user. Complete the given code.*/
public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        int number = 0;
        while (true) {
            number++;
            if (number > limit) {
                break;
            }
            if (number % 4 != 0) {
                continue;
            }
            System.out.println(number + " ");
        }

    }
}
