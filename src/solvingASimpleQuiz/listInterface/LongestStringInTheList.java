package src.solvingASimpleQuiz.listInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
mplement the changeList method so that it:

finds the longest string in the list
replaces all list items with the found string
 */
public class LongestStringInTheList {
    static void changeList(List<String> list) {
        // write your code here

        // Find the longest string in the list
        String longestString = list.get(0);
        for (String str : list) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }

        // Replace all elements with the longest string
        for (int i = 0; i < list.size(); i++) {
            list.set(i, longestString);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}
