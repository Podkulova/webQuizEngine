package src.solvingASimpleQuiz.methodOverriding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int animalType = scanner.nextInt();

        Animal2 animal;

        if (animalType == 1) {
            animal = new Cat2();
        } else if (animalType == 2) {
            animal = new Dog2();
        } else {
            animal = new Animal2();
        }

        animal.makeSound();
    }
}
class Animal2 {
    public void makeSound() {
        System.out.println("Generic sound");
    }
}

class Cat2 extends Animal2 {
    @Override
    public void makeSound() {
        System.out.println("Meow");;
    }
}

class Dog2 extends Animal2 {
    @Override
    public void makeSound() {
        System.out.println("Woof");
        ;
    }
}
