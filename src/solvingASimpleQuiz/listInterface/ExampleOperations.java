package src.solvingASimpleQuiz.listInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleOperations {
    public static void main(String[] args) {

        List<String> daysOfWeek = List.of(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        );

        System.out.println(daysOfWeek.size()); // 7
        System.out.println(daysOfWeek.get(1)); // Tuesday
        System.out.println(daysOfWeek.indexOf("Sunday")); // 6

        List<String> weekDays = daysOfWeek.subList(0, 5);
        System.out.println(weekDays); // [Monday, Tuesday, Wednesday, Thursday, Friday]

        //daysOfWeek.set(0, "Funday"); // throws UnsupportedOperationException
        //daysOfWeek.add("Holiday");   // throws UnsupportedOperationException

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); // fixed-size list
        numbers = Collections.unmodifiableList(numbers); // unmodifiable list
        System.out.println(numbers);
    }
}
