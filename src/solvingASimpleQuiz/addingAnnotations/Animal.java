package src.solvingASimpleQuiz.addingAnnotations;

import java.util.Scanner;

/*
Create two classes named 'Animal' and 'Dog'.
'Animal' should have a single method 'makeSound' which when called, returns the string 'animal sound'.
 'Dog' should be a subclass of 'Animal' and it should override the 'makeSound' method such that
  when the method 'makeSound' is called on an instance of 'Dog', it returns 'bark'.
  An annotation should be added to indicate that 'makeSound' method is being overridden in 'Dog'
  class. You will receive a single string input.
  If the input is 'Animal', create an instance of 'Animal' and print out the result of calling 'makeSound'.
  If the input is 'Dog', create an instance of 'Dog' and print out the result of calling 'makeSound'.
 */
public class Animal {
    // Animal class
        public String makeSound() {
            // Method to return animal sound
            return "animal sound";
        }
    }

    // Dog class
    class Dog extends Animal {
        // Write override annotation and the makeSound method here

        @Override
        public String makeSound() {
            return "bark";
        }
    }

    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String animalType = scanner.nextLine();

            // Depending on the input create instance of Animal or Dog and call it's makeSound method
            if (animalType.equals("Animal")) {
                Animal animal = new Animal();
                System.out.println(animal.makeSound());
            } else if (animalType.equals("Dog")) {
                Dog dog = new Dog();
                System.out.println(dog.makeSound());
            }
        }
    }
