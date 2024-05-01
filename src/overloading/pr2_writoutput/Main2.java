package src.overloading.pr2_writoutput;

/*
What does the code output?
*/
public class Main2 {
    public static void main(String[] args) {
        method(10.2f);
    }

    public static void method(float f) {
        System.out.println("float");
    }

    public static void method(int i) {
        System.out.println("int");
    }

    public static void method(double d) {
        System.out.println("double");
    }
}
