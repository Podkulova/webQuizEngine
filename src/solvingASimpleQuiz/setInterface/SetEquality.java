package src.solvingASimpleQuiz.setInterface;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetEquality {
    public static void main(String[] args) {
        Objects.equals(Set.of(1, 2, 3), Set.of(1, 3));    // false
        Objects.equals(Set.of(1, 2, 3), Set.of(1, 2, 3)); // true
        Objects.equals(Set.of(1, 2, 3), Set.of(1, 3, 2)); // true

        Set<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Objects.equals(numbers, Set.of(1, 2, 3)); // true

    }
}
