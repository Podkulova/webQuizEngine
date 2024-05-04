package src.solvingASimpleQuiz.multipleSwitch;

import src.solvingASimpleQuiz.objectsAndTheirProperties.Solution;

import java.util.Scanner;

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
