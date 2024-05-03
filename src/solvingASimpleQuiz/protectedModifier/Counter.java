package src.solvingASimpleQuiz.protectedModifier;

public class Counter {
    protected int i = 1221;

    void printCount(){
        System.out.println(i);
    }

    void incCount(){
        i = i + 1;
    }

}

class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.i);
    }
}
