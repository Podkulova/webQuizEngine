package src.solvingASimpleQuiz.objectsAndTheirProperties;

import java.util.Scanner;

/*
Write a method that checks if the object passed to it is null or not.
If it is null, the method must print "It's null" and if not it must print "It's an  object".
 */
public class Solution {
    public void printIsNull(Object o) {
        // write your code here
        if (o == null) {
            System.out.println("It's null");
        } else {
            System.out.println("It's an object");
        }
    }
}

// Do not change the code below
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            Object obj = "null".equals(scanner.nextLine()) ? null : new Object();
            solution.printIsNull(obj);
        }
    }
}

