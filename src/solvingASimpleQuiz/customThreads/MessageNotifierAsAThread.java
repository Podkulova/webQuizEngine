package src.solvingASimpleQuiz.customThreads;

public class MessageNotifierAsAThread extends Thread {

    // write fields to store variables here
    private String msg;
    private int repeats;

    public MessageNotifierAsAThread(String msg, int repeats) {
        // implement the constructor
        this.msg = msg;
        this.repeats = repeats;
    }

    @Override
    public void run() {
        // implement the method to print the message stored in a field
        for (int i = 0; i < repeats; i++) {
            System.out.println(msg);
        }
    }
}
// Test the implementation
class Main {
    public static void main(String[] args) {
        // Example usage with sample input
        MessageNotifierAsAThread notifier = new MessageNotifierAsAThread("Hello, Mary", 3);
        notifier.start();
    }
}
