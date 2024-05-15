package src.solvingASimpleQuiz.arrayList;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        ArrayList<Integer> numbers2 = new ArrayList<>();    // creating another list of Integers
        numbers2.add(100);
        numbers2.addAll(numbers); // [100, 1, 2, 3, 1]


        System.out.println(numbers2.contains(2));    // true
        System.out.println(numbers2.contains(4));    // false
        System.out.println(numbers2.indexOf(1));     // 1
        System.out.println(numbers2.lastIndexOf(1)); // 4
        System.out.println(numbers2.lastIndexOf(4)); // -1

    }
}
