package src.accessModifiers;

import java.util.Scanner;

/*
Managing speed in a car class
You are to write a Java program that defines a 'Car' class with a private field
 'speed', which is an integer. The class should also have a public method 'drive'
 that takes an integer as input and adds it to the 'speed'. If the end result is
 greater than 200, the program should cap the speed at 200. Finally, the program
 should have another public method 'displaySpeed' that prints the current speed value.
  The input defines how fast you want to drive your car. Your program should output
  the car speed after driving.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive(100);
        car.displaySpeed();
    }
}

class Car {
    private int speed;

    public Car() {
        speed = 0;
    }

    public void drive(int increase) {
        Scanner scanner = new Scanner(System.in);

        increase = scanner.nextInt();

        speed += increase; // Increase speed by the given value

        if (speed  >= 200) {
            speed = 200; // Cap the speed at 200
        }
    }

    public void displaySpeed() {
        System.out.println(speed);
    }
}