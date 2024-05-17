package src.solvingASimpleQuiz.threadsAsObjects;

public class ExampleMainThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread(); // main thread

        System.out.println("Name: " + t.getName());
        System.out.println("ID: " + t.getId());
        System.out.println("Alive: " + t.isAlive()); // Vyvolání t.isAlive()vrátí, zda bylo vlákno spuštěno a ještě nezemřelo
        System.out.println("Priority: " + t.getPriority()); // Každé vlákno má prioritu a getPriority()metoda vrací prioritu daného vlákna
        System.out.println("Daemon: " + t.isDaemon()); // Vlákno s nízkou prioritou

        t.setName("my-thread");
        System.out.println("New name: " + t.getName());
    }
}
