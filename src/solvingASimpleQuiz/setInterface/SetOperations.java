package src.solvingASimpleQuiz.setInterface;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {

        // getting a mutable set from an immutable one
        Set<String> countries = new HashSet<>(List.of("India", "Japan", "Switzerland"));

        countries.addAll(List.of("India", "Germany", "Algeria"));
        System.out.println(countries); // [Japan, Algeria, Switzerland, Germany, India]

        countries.retainAll(List.of("Italy", "Japan", "India", "Germany"));
        System.out.println(countries); // [Japan, Germany, India]

        countries.removeAll(List.of("Japan", "Germany", "USA"));
        System.out.println(countries); // [India]

        Set<String> countries2 = new HashSet<>(List.of("India", "Japan", "Algeria"));

        System.out.println(countries2.containsAll(Set.of())); // true
        System.out.println(countries2.containsAll(Set.of("India", "Japan")));   // true
        System.out.println(countries2.containsAll(Set.of("India", "Germany"))); // false
        System.out.println(countries2.containsAll(Set.of("Algeria", "India", "Japan"))); // true

    }
}
