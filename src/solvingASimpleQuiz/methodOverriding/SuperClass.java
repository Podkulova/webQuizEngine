package src.solvingASimpleQuiz.methodOverriding;

public class SuperClass {
    public static void staticMethod(int i) {
    }

    public void method1(int i) {
    }

    public void method2(int i, String s) {
    }

    private void method3(int i) {
    }
}

class SubClass extends SuperClass {

    // public static void staticMethod(int i) { }

    public void method1(int i) {
    }

    //  public void method2(String s) { }

    //  public void method3(int i) { }
}

