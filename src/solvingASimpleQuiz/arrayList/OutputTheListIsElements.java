package src.solvingASimpleQuiz.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class OutputTheListIsElements {
    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        // write your code here

        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
