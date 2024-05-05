package src.solvingASimpleQuiz.methodOverriding;

class Codeprint {
    class A {

        public void print() {
            System.out.println("A");
        }
    }

    class B extends A {

        @Override
        public void print() {
            System.out.println("B");
        }
    }

  class C extends B { }

    class D extends C {

        @Override
        public void print() {
            System.out.println("D");
        }
    }

    public static void main(String[] args) {
        Codeprint codeprint = new Codeprint();

    }
}
