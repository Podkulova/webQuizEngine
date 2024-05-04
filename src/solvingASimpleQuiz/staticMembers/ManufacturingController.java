package src.solvingASimpleQuiz.staticMembers;

import java.util.Scanner;

/*
John decided to create a manufacturing firm. It produces various, mainly mechanical details.
John wants to automate details producing requests, but sadly he cannot write code.
He asks you to write a simple manufacturing controller.

You are given two methods, requestProduct and getNumberOfProducts:

getNumberOfProducts should return the total number of requested products;
requestProduct should keep track of requested products, and format the product argument in the format:
No. Requested Detail.
 */

public class ManufacturingController {
    // here you may declare a field
    public static int numberOfProducts = 0;

    public static String requestProduct(String product) {
        // write your code here
        numberOfProducts++;
        return numberOfProducts + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        // write your code here
        return numberOfProducts;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}
