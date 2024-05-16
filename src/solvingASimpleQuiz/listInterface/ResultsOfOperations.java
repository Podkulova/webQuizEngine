package src.solvingASimpleQuiz.listInterface;

import java.util.ArrayList;
import java.util.List;

/*
Select all correct statements about this list.
 */
public class ResultsOfOperations {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");

        System.out.println(list.size()); //is 4

        System.out.println(list.subList(0, 1)); // includes two elements

        System.out.println(list.contains("FIRST")); // returns false

        System.out.println(list.get(3)); // is "third"

    }
}
