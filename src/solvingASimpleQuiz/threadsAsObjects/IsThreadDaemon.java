package src.solvingASimpleQuiz.threadsAsObjects;

/*
Implement the method printIfDaemon of the ThreadUtil class which accepts
 a Thread object and prints daemon if the thread is daemon or not daemon otherwise.
 */
public class IsThreadDaemon {
    public static void printIfDaemon(Thread thread) {
        // implement logic
        if (thread.isDaemon()) {
            System.out.println("daemon");
        } else {
            System.out.println("not daemon");
        }
    }
}
