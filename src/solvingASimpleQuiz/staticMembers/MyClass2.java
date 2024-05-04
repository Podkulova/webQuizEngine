package src.solvingASimpleQuiz.staticMembers;

/*
Vyberte všechny správné řádky kódu.
 */
public class MyClass2 {
    long longField;
    static String strField;

    static void method2() {
        System.out.println(strField);  // (1)
     //   System.out.println(longField); // (2)

    }

    void method1() {
        System.out.println(strField);  // (3)
        System.out.println(longField); // (4)
    }
}
