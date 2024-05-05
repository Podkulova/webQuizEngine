package src.solvingASimpleQuiz.methodOverriding;

/*
Select all methods of the class A that are correctly overridden in the class B.
 */
public class CorrectlyOverriddenMethods {
    class A {

        public void doA() {
        }

        public final void doB() {
        }

        public void doC(int k) {
        }

        protected void doD() {
        }

        protected void doE() {
        }
    }

    class B extends A {

        //@Override
        // public void doA() { }

        //@Override
        // public void doB() { }

        //  @Override
        // public void doC(String s) { }

        // @Override
        // private void doD() { }

        public void doE() {
        }
    }
}
