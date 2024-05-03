package src.solvingASimpleQuiz.overloading.constructor.introducingAPerson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read name and age from the user
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        // Create a Person instance with the given name and age
        Person person = new Person(name, age);

        // Call the introduce() method of the Person instance
        person.Introduction();

        scanner.close();
    }
}
