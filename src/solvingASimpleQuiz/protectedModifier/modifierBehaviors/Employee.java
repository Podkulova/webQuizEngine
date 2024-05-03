package src.solvingASimpleQuiz.protectedModifier.modifierBehaviors;

/*
Consider the following code snippets in Java with respect to the 'protected' access modifier.
 What will be the result if we run 'Main' class in 'package2'?
 */
public class Employee {
    protected String name = "John Doe";

    protected void display() {
        System.out.println("Employee name: " + name);
    }
}
