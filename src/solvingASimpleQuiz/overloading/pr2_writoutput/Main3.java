package src.solvingASimpleQuiz.overloading.pr2_writoutput;

/*
What does the code output? Enter a string.
*/
public class Main3 {
    public static void main(String[] args) {
        method(1f, 1f);
    }

    public static void method(int i, float f) {
        System.out.println("int float method");
    }

    public static void method(float f, int i) {
        System.out.println("float int method");
    }

    public static void method(int i1, int i2) {
        System.out.println("int int method");
    }

    public static void method(double d1, double d2) {
        System.out.println("double double method");
    }
}
