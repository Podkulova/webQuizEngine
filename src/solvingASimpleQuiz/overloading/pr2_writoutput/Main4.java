package src.solvingASimpleQuiz.overloading.pr2_writoutput;

/*
What does the code output? Enter a string.
*/
public class Main4 {
    public static void main(String[] args) {
        method(10);
    }

    public static void method(short s) {
        System.out.println("short");
    }

    public static void method(byte b) {
        System.out.println("byte");
    }

    public static void method(int i) {
        System.out.println("int");
    }

    public static void method(long l) {
        System.out.println("long");
    }
}
