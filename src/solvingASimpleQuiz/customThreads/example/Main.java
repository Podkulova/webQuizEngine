package src.solvingASimpleQuiz.customThreads.example;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new HelloThread(); // a subclass of Thread

        Thread t2 = new Thread(new HelloRunnable()); // passing runnable

        Thread myThread = new Thread(new HelloRunnable(), "my-thread");

        Thread t3 = new Thread(() -> {
            System.out.println(String.format("Hello, I'm %s", Thread.currentThread().getName()));
        });

        Thread t = new HelloThread(); // an object representing a thread
        t.start();
    }

}
