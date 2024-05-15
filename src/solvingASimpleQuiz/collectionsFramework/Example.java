package src.solvingASimpleQuiz.collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Example {
    public static void main(String[] args) {

        Collection<String> languages = new ArrayList<>();

        languages.add("English");
        languages.add("Deutsch");
        languages.add("Français");
        languages.add("Français");

        System.out.println(languages.size()); // 3

        for (String lang : languages) {
            System.out.println(lang);
        }
        System.out.println("------------------");
        languages.forEach(System.out::println); // with method reference
        System.out.println("------------------");
        languages.forEach(elem -> System.out.println(elem)); // with lambda expression

        System.out.println("------------------");
        languages.remove("Deutsch");
        System.out.println(languages.size()); // 2

        System.out.println("------------------");
        languages.removeIf(lang -> lang.startsWith("E")); // it removes English
        System.out.println(languages.size()); // 1
    }
}
