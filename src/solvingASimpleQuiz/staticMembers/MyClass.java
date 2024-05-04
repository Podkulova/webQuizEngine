package src.solvingASimpleQuiz.staticMembers;

/*
Vyberte všechna správná tvrzení o MyClass.
 */
public class MyClass {
    static final String TEXT = "Hello";

    int magic = 10;

    static void doSomething() {
        String text = TEXT;
    }

    void doDo() {
        doSomething();
        String text = TEXT;
    }
}
