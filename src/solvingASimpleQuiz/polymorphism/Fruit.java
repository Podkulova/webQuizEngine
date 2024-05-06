package src.solvingASimpleQuiz.polymorphism;

import java.util.Scanner;

/*
Imagine you have a superclass 'Fruit' with a method 'taste()'.
You also have two subclasses 'Apple' and 'Orange' that extends 'Fruit'.
The taste() method returns the taste of the fruit as a string.
You need to create the classes and override the taste() method in the subclasses.
For an input fruit type, your code should call the taste() method of the corresponding fruit class and print
the result.
Input: - A single line that contains a string representation of the fruit type (either 'Apple' or 'Orange')
Output: - For an input of 'Apple', the output should be 'Sweet' - For an input of 'Orange', the output
should be 'Sour'
 */
// Start with creating a superclass
public class Fruit {

    // Create a method taste()
    public String taste() {
        // Implement your code here
        return "Unknown";
    }
}

// Create two subclasses Apple and Orange extending the Fruit class

// Class for Apple
class Apple extends Fruit {
    // Override the taste() method here
    @Override
    public String taste() {
        return "Sweet";
    }
}

// Class for Orange
class Orange extends Fruit {
    // Override the taste() method here
    @Override
    public String taste() {
        return "Sour";
    }
}

class Main {
    public static void main(String[] args) {
        // Take the input of fruit type from the user
        Scanner in = new Scanner(System.in);
        String fruitType = in.nextLine();

        // Depending on the fruit type, create an object of the respective fruit class
        Fruit fruit;
        // Call the taste() method and print the result
        if (fruitType.equals("Apple")) {
            fruit = new Apple();
        } else if (fruitType.equals("Orange")) {
            fruit = new Orange();
        } else {
            fruit = new Fruit(); // Default fruit for unknown types
        }

        System.out.println(fruit.taste());
    }
}

