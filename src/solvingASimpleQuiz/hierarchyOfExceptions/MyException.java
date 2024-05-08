package src.solvingASimpleQuiz.hierarchyOfExceptions;

/*
Create a class named UncheckedException, which must inherit from an unchecked exception.
Inside the UncheckedExceptionclass declare a no-argument constructor.
 */
public class MyException extends RuntimeException {
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    //do not change the code
    class Main {
        public static void main(String[] args) {
            MyException myException = new MyException("This is a custom exception");
            System.out.println(myException.getMessage());
        }
    }
}