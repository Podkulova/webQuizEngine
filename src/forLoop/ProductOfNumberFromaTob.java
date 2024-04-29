package src.forLoop;

import java.util.Scanner;

/*Write a program that prints the product of all integer numbers from a to b (a < b).

Include a and exclude b from the product.

For example, if a=2 and b=5, then the answer is 2*3*4=24.*/
public class ProductOfNumberFromaTob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the number b: ");
        int b = scanner.nextInt();

        int product = 1;

        for (int i = a; i < b; i++) {
            product *= i;
        }
        System.out.println("The product of all integers from " + a + " to " + (b - 1) + " is: " + product);
        scanner.close();
    }
}
