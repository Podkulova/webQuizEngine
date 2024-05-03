package src.inheritance.theLostModifier;

/*
You have a base class and a derived class. Both classes are in different packages.
 */
public class DerivedClass extends BaseClass{
    private int b;

    public int sum() {
        return a + b;
    }
}
