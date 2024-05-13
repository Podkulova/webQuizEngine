package src.solvingASimpleQuiz.genericsAndObject;

/*
You've got a piece of software that utilizes generic programming to create
 a simple holder called 'Box' for different types of objects, and a 'Main'
 class for testing. The Main class creates a box for Integer objects and wants
 to print out the object's value. Your task is to inspect the software and fill in
 the blanks in the code to ensure correct creation of the Box, placing an Integer into
 the box, retrieving the Integer, and correctly printing the Integer's value.
 */
public class WhatIsWrong<T> {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setT(10);
        System.out.println(integerBox.getT().toString());
    }


    static class Box<T> {
        private T t;

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }
    }
}