package src.solvingASimpleQuiz.interfaces;

interface Animal {
    String makeSound();
}

class Dog implements Animal {
    public String makeSound() {
        return "Woof!";
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println(dog.makeSound());
    }
}

