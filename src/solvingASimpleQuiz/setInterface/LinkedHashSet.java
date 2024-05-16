package src.solvingASimpleQuiz.setInterface;

import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {

        Set<Character> characters = new java.util.LinkedHashSet<>();

        for (char c = 'a'; c <= 'k'; c++) {
            characters.add(c);
        }

        System.out.println(characters); // [a, b, c, d, e, f, g, h, i, j, k]
    }
}
