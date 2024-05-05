package src.solvingASimpleQuiz.methodOverriding;

/*
Select a method of the class A that is incorrectly overridden in the class B.
 */
class A {
    public A method1() {
        return new A();
    }

    public B method2() {
        return new B();
    }

    public A method3(A a) {
        return a;
    }

    public B method4() {
        return new B();
    }

}

class B extends A {

    @Override
    public B method1() {
        return new B();
    }

    @Override
    public B method2() {
        return new B();
    }

    public A method3(A a) {
        return a;
    }

    // public A method4() { return new A(); }
}
