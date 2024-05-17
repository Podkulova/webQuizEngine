package src.solvingASimpleQuiz.threadsAsObjects;

/*
Implement the method getName of the ThreadUtil class which accepts a Thread object and returns its name.
 */
public class ThreadName {
    public static String getName(Thread thread) {
        // implement logic
        return thread.getName();
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            System.out.println("Running in a custom thread");
        });
        myThread.setName("CustomThread");
        System.out.println(ThreadName.getName(myThread));
    }
}
