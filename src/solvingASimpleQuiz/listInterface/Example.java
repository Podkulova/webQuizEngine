package src.solvingASimpleQuiz.listInterface;

import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<String> emptyList = List.of(); // 0 elements
        List<String> names = List.of("Larry", "Kenny", "Sabrina"); // 3 elements
        List<Integer> numbers = List.of(0, 1, 1, 2, 3, 5, 8, 13);  // 8 elements

        System.out.println(emptyList);
        System.out.println(names);
        System.out.println(numbers);;
    }
}
