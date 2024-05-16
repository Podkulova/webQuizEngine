package src.solvingASimpleQuiz.setInterface;

import java.util.HashSet;
import java.util.Set;

/*
Which elements does the set contain after performing all the operations?
 */
public class ElementsOfASet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.addAll(Set.of(1, 2, 3, 4));
        set.retainAll(Set.of(2, 3, 4, 5));
        set.removeAll(Set.of(1, 2));

        System.out.println(set);
    }
}
