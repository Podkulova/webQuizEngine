package src.forLoop;

import java.util.Scanner;

/*You're given an unfinished program that should output all powers of
two that are lower than the number entered by the user. Complete the
for-loop parts so that the program will work correctly.*/
public class PowersOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextInt();

        for (long i = 1; i < num; i*=2) {
            System.out.println(i);
        }
    }
}
