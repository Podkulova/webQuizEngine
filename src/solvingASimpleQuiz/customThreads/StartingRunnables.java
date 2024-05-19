package src.solvingASimpleQuiz.customThreads;

public class StartingRunnables {
    public static void startRunnables(Runnable[] runnables) {
        // implement the method
        for (Runnable runnable : runnables) {
            // Create a new Thread for each Runnable and start it
            new Thread(runnable).start();
        }
    }

    public static void main(String[] args) {
        // Example usage with sample Runnables
        Runnable task1 = () -> System.out.println("Task 1 is running");
        Runnable task2 = () -> System.out.println("Task 2 is running");
        Runnable task3 = () -> System.out.println("Task 3 is running");

        // Create an array of Runnables
        Runnable[] tasks = {task1, task2, task3};

        // Start all Runnables
        StartingRunnables.startRunnables(tasks);
    }
}
