package src.solvingASimpleQuiz.overloading.arraysAsParameters;

public class CallingVarargs {
    public static void main(String[] args) {
        method(0);
        method(1, 2, 3);
        method(new int[] { 1, 2 });
        method();
    }

    public static void method(int... vararg) {
        System.out.println(vararg.length);
    }
}
