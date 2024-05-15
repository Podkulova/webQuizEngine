package src.solvingASimpleQuiz.whatAreCollections;

import java.util.ArrayList;

public class UnderstandingCodeWithCollections {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(4);
        numbers.add(8);
        numbers.add(3);

        System.out.println(numbers.get(numbers.size() - 1));
    }
}
