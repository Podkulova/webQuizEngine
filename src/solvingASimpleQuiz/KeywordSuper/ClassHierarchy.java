package src.solvingASimpleQuiz.KeywordSuper;

/*
What is the output of invoking the main method of the Main class?
Type the numbers without whitespaces in one line into the input field.
 */
public class ClassHierarchy {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    protected int n = 10;
}

class B extends A {
    protected int n = 20;

    public B() {
        super();
        System.out.print(n);
    }
}

class C extends B {
    protected int n = 30;

    public C() {
        this(5);
        System.out.print(n);
    }

    public C(int n) {
        super();
        super.n = n;
        System.out.print(n);
    }
}
