package src.solvingASimpleQuiz.overloading.forLoop;

import java.util.Scanner;

/*Write a program that reads an integer n and prints the sum of the first n positive
odd numbers using a for loop. The input consists of a single integer n (1 <= n <= 100)
n a line by itself. The output should be the sum of the first n positive odd numbers printed
on a single line.*/

public class SumOfFirstNOddNumbersUsingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 2 * i -1;
        }


        System.out.println("The sum of the first " + n + " positive odd numbers is: " + sum);

        scanner.close();
    }
}
