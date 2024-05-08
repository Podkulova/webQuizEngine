package src.solvingASimpleQuiz.nullPointerException;

import java.util.Objects;

public class WhereNPEmightOccur {
    public static void main(String[] args) {
        String name = null;
        String surname = null;

        // 1)
        "Harrison".equals(name);

        // 2)
        //name.length();

        // 3)
        Objects.equals(name, surname);

        // 4)
        //name.equals(surname);
    }
}
