package src.solvingASimpleQuiz.referencingSubclassObjects.implementingVehicleHierarchyWithWheels;

import src.solvingASimpleQuiz.referencingSubclassObjects.IncorrectAssignments;

import java.util.Scanner;

class Vehicle {
    protected int numWheels;

    public Vehicle(int wheels) {
        numWheels = wheels;
    }

    public void printWheels() {
        System.out.println("A vehicle has " + numWheels + " wheels.");
    }
}

class Bicycle extends Vehicle {
    public Bicycle() {
        super(2);
    }

    @Override
    public void printWheels() {
        System.out.println("A bicycle has " + numWheels + " wheels.");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle() {
        super(2);
    }

    @Override
    public void printWheels() {
        System.out.println("A motorcycle has " + numWheels + " wheels.");
    }
}

class Car extends Vehicle {
    public Car() {
        super(4);
    }

    @Override
    public void printWheels() {
        System.out.println("A car has " + numWheels + " wheels.");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.nextLine();

        Vehicle vehicle;

        // Create an instance of the appropriate vehicle class based on vehicleType
        switch (vehicleType) {
            case "bicycle":
                vehicle = new Bicycle();
                break;
            case "motorcycle":
                vehicle = new Motorcycle();
                break;
            case "car":
                vehicle = new Car();
                break;
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType);
        }
        vehicle.printWheels();
    }
}
