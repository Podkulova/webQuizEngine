package src.solvingASimpleQuiz.referencingSubclassObjects;

/*
You have a class hierarchy including a base class and two derived classes.
 */
public class IncorrectAssignments {
    public class A {
    }

    public class B extends A {
    }

    public class C extends B {
    }


    A a1 = new A(); // (1)
    A a2 = new C(); // (2)

    B b1 = new B(); // (3)
   // B b2 = new A(); // (4)
    B b3 = new C(); // (5)

   // C c1 = new B(); // (6)
    C c2 = new C(); // (7)
}
