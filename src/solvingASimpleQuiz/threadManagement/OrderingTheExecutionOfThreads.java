package src.solvingASimpleQuiz.threadManagement;

class OrderingTheExecutionOfThreads {
    public static void invokeMethods(Thread t1, Thread t2, Thread t3) throws InterruptedException {
        // start passed instances here
        t3.start();
        t3.join();  // Wait for t3 to complete

        t2.start();
        t2.join();  // Wait for t2 to complete

        t1.start();
        t1.join();  // Wait for t1 to complete
    }
}
