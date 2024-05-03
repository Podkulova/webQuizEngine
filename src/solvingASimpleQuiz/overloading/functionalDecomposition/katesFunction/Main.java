package src.solvingASimpleQuiz.overloading.functionalDecomposition.katesFunction;

import java.util.Scanner;

/*
The template for this function is defined below. Let's decompose it!

Your task is to create three additional methods f1, f2, and f3 for
each case and complete the method f. Each method should accept x as an argument with double type.*/
public class Main {
    public static void main(String[] args) {

        MultipleFunction multipleFunction = new MultipleFunction();

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        System.out.println(MultipleFunction.f(x));

    }
}
