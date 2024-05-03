package src.solvingASimpleQuiz.overloading.instanceMethod;

/*
You want to create a program that models the behavior of cars. For this purpose, you've created a class named Car containing three fields: the int field yearModel, the string field make, and the int field speed.

You want to add functionality to your cars, so you need methods. Add the following instance methods to your class:

void accelerate() that adds 5 to the speed each time it's called;
void brake() that subtracts 5 from the speed field each time it's called, the speed cannot be less than zero.
Do not make the fields and methods private.
 */
public class Car {
    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        speed -= 5;
        if (speed < 0) {
            speed = 0;
        }
    }
}
