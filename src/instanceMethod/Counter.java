package src.instanceMethod;

/*
You are given a class named Counter. Write two instance methods:

inc that increases the value of the field current by one;
getCurrent that returns the current value;
Do not make the field and methods private.
 */
public class Counter {
    int current;

    public void inc() {
        current++;
    }

    public int getCurrent() {
        return current;
    }
}
