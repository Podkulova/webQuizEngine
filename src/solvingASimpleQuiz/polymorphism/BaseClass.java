package src.solvingASimpleQuiz.polymorphism;

/*
What is the output of the code below?
 */
public class BaseClass {

    public void print() {
        System.out.println("Base class");
    }

    public static class DerivedClass extends BaseClass {

        public void print() {
            System.out.println("Derived class");
            super.print();
        }
    }

    public static void main(String[] args) {
        BaseClass clazz = new DerivedClass();
        clazz.print();
    }
}
