package src.solvingASimpleQuiz.threadsAsObjects;

/*
Implement a method that prints the information about the thread executing this method.
The information includes the thread's name and its priority.

Don't forget to specify what is the data in the output. Here is the output example:

name: my-thread
priority: 5
 */
public class GettingCurrentThreadInfo {
    public static void printCurrentThreadInfo() {
        // get the thread and print its info
        Thread t = Thread.currentThread();

        t.setName("my-thread");

        System.out.println("name: " + t.getName());
        System.out.println("priority: " + t.getPriority());
    }

    public static void main(String[] args) {
        printCurrentThreadInfo();
    }
}
