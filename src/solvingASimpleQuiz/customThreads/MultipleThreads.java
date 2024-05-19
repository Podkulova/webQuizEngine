package src.solvingASimpleQuiz.customThreads;

/*
1) Create two instances of the given class and set the names like "worker-X", where X is any suffix (use the constructor to set the name).

2) Start the created threads. The method run of each instance must be executed in a new thread.

Note: the given class will be added to your solution automatically.
 */
public class MultipleThreads {
    public static void main(String[] args) {

        // Vytvoření instancí WorkerThread a nastavení názvů
        WorkerThread worker1 = new WorkerThread("worker-1");
        WorkerThread worker2 = new WorkerThread("worker-2");

        // Spuštění vytvořených vláken
        worker1.start();
        worker2.start();
    }
}

// Don't change the code below
class WorkerThread extends Thread {
    private static final int NUMBER_OF_LINES = 3;

    public WorkerThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (!name.startsWith("worker-")) {
            return;
        }

        for (int i = 0; i < NUMBER_OF_LINES; i++) {
            System.out.println("do something...");
        }
    }
}
