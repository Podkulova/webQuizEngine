package src.solvingASimpleQuiz.threadManagement;

public class TheMaxNumberOfParallelThreads {

    public static void main(String args[]) throws InterruptedException {
        Thread t1 = new SlackerThread();
        Thread t2 = new SlackerThread();

        t1.start();
        t2.start();

        t2.join();

        Thread t3 = new SlackerThread();
        Thread t4 = new SlackerThread();

        t3.start();
        t4.start();

        t3.join();
        t4.join();
    }
}

class SlackerThread extends Thread {
    @Override
    public void run() {
        try {
            // Simulate doing work by sleeping for a random time
            int sleepTime = (int) (Math.random() * 5000);
            System.out.println(Thread.currentThread().getName() + " will sleep for " + sleepTime + " ms");
            Thread.sleep(sleepTime);
            System.out.println(Thread.currentThread().getName() + " has finished sleeping");
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName() + " was interrupted");

        }
    }
}
