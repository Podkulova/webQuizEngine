package src.solvingASimpleQuiz.setInterface;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {

        Set<String> countries = new java.util.HashSet<>();

        countries.add("India");
        countries.add("Japan");
        countries.add("Switzerland");
        countries.add("Japan");
        countries.add("Brazil");

        System.out.println(countries); // [Japan, Brazil, Switzerland, India]
        System.out.println(countries.contains("Switzerland")); // true
    }
}
