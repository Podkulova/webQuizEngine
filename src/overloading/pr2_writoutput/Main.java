package src.overloading.pr2_writoutput;

/*
What does the code output? Enter a string.
*/

public class Main {
    public static void main(String[] args) {
        method('a');
    }

    public static void method(int i) {
        System.out.println("int");
    }

    public static void method(long l) {
        System.out.println("long");
    }

    public static void method(char c) {
        System.out.println("char");
    }
}
