package src.solvingASimpleQuiz.customThreads.example;

public class HelloThread extends Thread {
    @Override
    public void run() {
        String helloMsg = String.format("Hello, I'm %s", getName());
        System.out.println(helloMsg);
    }
}
