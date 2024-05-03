package src.solvingASimpleQuiz.protectedModifier.modifierBehaviors;

/*
Consider the following code snippets in Java with respect to the 'protected' access modifier.
 What will be the result if we run 'Main' class in 'package2'?
 */
public class Main extends Employee {
    public static void main(String[] args) {
        Main object = new Main();
        System.out.println(object.name);
        object.display();
    }
}
