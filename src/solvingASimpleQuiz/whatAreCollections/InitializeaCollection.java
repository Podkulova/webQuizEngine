package src.solvingASimpleQuiz.whatAreCollections;

import java.util.ArrayList;

public class InitializeaCollection {
    ArrayList<String> list = new ArrayList<>();

    void init() {
        // add "one", "two", "three" to list field in this order
        list.add("one");
        list.add("two");
        list.add("three");
    }
}

class Test {
    public static void main(String[] args) {
        InitializeaCollection main = new InitializeaCollection();
        main.init();

        for (String str : main.list) {
            System.out.println(str);
        }
    }
}

