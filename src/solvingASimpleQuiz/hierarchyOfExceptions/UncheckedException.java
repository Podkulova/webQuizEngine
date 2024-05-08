package src.solvingASimpleQuiz.hierarchyOfExceptions;

public class UncheckedException extends RuntimeException{
    public UncheckedException() {
    }
}

class Main {
    public static void main(String[] args) {
        UncheckedException uncheckedException = new UncheckedException();
        System.out.println(uncheckedException instanceof RuntimeException);
    }
}