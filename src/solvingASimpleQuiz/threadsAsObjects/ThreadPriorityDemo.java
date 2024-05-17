package src.solvingASimpleQuiz.threadsAsObjects;

/*
Find out the min and max acceptable priorities of threads in Java. Enter them separated by a space,
 like this:

5 999

To solve the task you need to use additional information sources.
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        int minPriority = Thread.MIN_PRIORITY;
        int maxPriority = Thread.MAX_PRIORITY;

        System.out.println("Minimální priorita vlákna: " + minPriority);
        System.out.println("Maximální priorita vlákna: " + maxPriority);

    }
}
