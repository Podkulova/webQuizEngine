package src.solvingASimpleQuiz.customThreads;

public class StartingThreads {
    public static void main(String[] args) {
        // create threads and start them using the class RunnableWorker
        RunnableWorker worker1 = new RunnableWorker();
        RunnableWorker worker2 = new RunnableWorker();
        RunnableWorker worker3 = new RunnableWorker();

        // Create threads with specific names
        Thread thread1 = new Thread(worker1, "worker-1");
        Thread thread2 = new Thread(worker2, "worker-2");
        Thread thread3 = new Thread(worker3, "worker-3");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

// Don't change the code below
class RunnableWorker implements Runnable {

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (name.startsWith("worker-")) {
            System.out.println("too hard calculations...");
        } else {
            return;
        }
    }
}