package src.solvingASimpleQuiz.listInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListEquality {
    public static void main(String[] args) {

        Objects.equals(List.of(1, 2, 3), List.of(1, 2, 3));    // true
        Objects.equals(List.of(1, 2, 3), List.of(1, 3, 2));    // false
        Objects.equals(List.of(1, 2, 3), List.of(1, 2, 3, 1)); // false

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Objects.equals(numbers, List.of(1, 2, 3)); // true

        System.out.println(numbers);
    }
}
