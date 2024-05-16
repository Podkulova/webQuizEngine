package src.solvingASimpleQuiz.setInterface;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/*
Create a TreeSet named set and fill it with the following three strings "Gamma", "Alpha", "Omega".

The code for displaying the set is already written.
 */
public class CreatingASet {
    public static void main(String[] args) {
        // write your code here
        SortedSet<String> set = new TreeSet<>();

        set.add("Gamma");
        set.add("Alpha");
        set.add("Omega");

        System.out.println(set);
    }
}
