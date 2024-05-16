package src.solvingASimpleQuiz.listInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MutableLists {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(10);
        numbers.add(20);

        System.out.println(numbers); // [15, 10, 20]

        numbers.set(0, 30); // no exceptions here

        System.out.println(numbers); // [30, 10, 20]

        List<String> immutableList = List.of("one", "two", "three");
        List<String> mutableList = new ArrayList<>(immutableList);
        System.out.println(immutableList);

        List<Integer> numbers2 = new LinkedList<>();

        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);

        System.out.println(numbers2); // [10, 20, 30]
    }
}
