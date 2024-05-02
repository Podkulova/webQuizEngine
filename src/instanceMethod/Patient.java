package src.instanceMethod;

import java.util.Scanner;

class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("Hello, my name is " + name + ", I need a doctor.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Patient patient = new Patient(name);
        patient.say();

        scanner.close();
    }
}