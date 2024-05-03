package src.solvingASimpleQuiz.overloading.instanceMethod;

/*
Jake wants to write a program that works with complex numbers.
He created a class Complex that represents a complex number with its real and imaginary parts.
Now he needs instance methods so that he can calculate the sum and difference of two complex
numbers.

Help Jake and create two instance methods for his class:

add(Complex num) that takes another complex number as an argument and
adds its corresponding fields to the current instance;

subtract(Complex num) that takes another complex number as an argument and
 subtracts its corresponding fields from the current instance;

Both methods should return nothing. Do not make the fields and methods private.

A complex number consists of two parts: Real and Imaginary (denoted with i).
In the add method, you should add the real part of the first complex number with the
 real part of the second complex number. Then add the imaginary parts of the complex numbers with each other. For subtract method, subtract the real and imaginary parts respectively.
 */
public class Complex {
    double real;
    double image;

    public void add(Complex num) {
        real += num.real;
        image += num.image;
    }

    public void subtract(Complex num) {
        real -= num.real;
        image -= num.image;
    }
}
