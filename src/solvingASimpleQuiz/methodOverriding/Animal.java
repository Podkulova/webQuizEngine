package src.solvingASimpleQuiz.methodOverriding;

/*
You have four classes: Animal, Cat, Dog, and Duck.
The class animal has a method say().

Override the method in all subclasses.
Overridden methods should output what these animals say (using System.out.println).
 */

public class Animal {
    public void say() {
        System.out.println("...An incomprehensible sound...");
    }
}

class Cat extends Animal {
    @Override
    public void say() {
        System.out.println("meow-meow");
    }
}

class Dog extends Animal {
    @Override
    public void say() {
        System.out.println("arf-arf");
    }
}

class Duck extends Animal {
    @Override
    public void say() {
        System.out.println("quack-quack");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.say();

        Cat cat = new Cat();
        cat.say();

        Dog dog = new Dog();
        dog.say();

        Duck duck = new Duck();
        dog.say();
    }
}


