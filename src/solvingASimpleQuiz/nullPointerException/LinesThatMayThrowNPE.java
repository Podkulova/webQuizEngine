package src.solvingASimpleQuiz.nullPointerException;

import java.util.Objects;

/*
Suppose you have two string variables city and capital.

Select the line that may throw NPE.
 */
public class LinesThatMayThrowNPE {
    public static void main(String[] args) {
        String city = null;
        String capital = null;

        // 1)
        if (city != null) { System.out.println(city.substring(0, 2)); }

        // 2)
        Objects.equals(city, "Melbourne");

        // 3)
        Objects.equals(city, capital);

        // 4)
        city.equals("Sydney");
    }
}
