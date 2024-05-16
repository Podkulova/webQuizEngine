package src.solvingASimpleQuiz.setInterface;

import java.util.SortedSet;

public class TreeSet {
    public static void main(String[] args) {

        SortedSet<Integer> sortedSet = new java.util.TreeSet<>();

        sortedSet.add(10);
        sortedSet.add(15);
        sortedSet.add(13);
        sortedSet.add(21);
        sortedSet.add(17);

        System.out.println(sortedSet); // [10, 13, 15, 17, 21]

        System.out.println(sortedSet.headSet(15)); // [10, 13]
        System.out.println(sortedSet.tailSet(15)); // [15, 17, 21]

        System.out.println(sortedSet.subSet(13, 17)); // [13, 15]

        System.out.println(sortedSet.first()); // minimum is 10
        System.out.println(sortedSet.last());  // maximum is 21
    }
}
