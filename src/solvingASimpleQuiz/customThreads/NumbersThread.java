package src.solvingASimpleQuiz.customThreads;

class NumbersThread extends Thread {

    private int from;
    private int to;

    public NumbersThread(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        NumbersThread thread1 = new NumbersThread(1, 3);
        thread1.start();

        NumbersThread thread2 = new NumbersThread(2, 2);
        thread2.start();
    }
}

