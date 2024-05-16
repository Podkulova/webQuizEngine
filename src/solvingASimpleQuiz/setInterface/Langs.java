package src.solvingASimpleQuiz.setInterface;

import java.util.HashSet;
import java.util.Set;

public class Langs {
    public static void main(String[] args) {

        Set<String> langs1 = new HashSet<>();

        langs1.add("Java");
        langs1.add("Scala");
        langs1.add("Kotlin");

        Set<String> langs2 = new HashSet<>();

        langs2.add("Python");
        langs2.add("Kotlin");
        langs2.add("JAVA");

        langs1.addAll(langs2);
        System.out.println(langs1);
    }
}
