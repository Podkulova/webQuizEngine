package src.solvingASimpleQuiz.setInterface;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*
Here's a set of strings.

Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

Output each of its elements with the loop with a new line.
 */
public class OutputElements {
    public static void main(String[] args) {

        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        // write your code here

        for (String name : nameSet) {
            System.out.println(name);
        }
    }
}
