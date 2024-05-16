package src.solvingASimpleQuiz.listInterface;

import java.util.List;

public class IteratingOverAList {
    public static void main(String[] args) {

        List<String> names = List.of("Larry", "Kenny", "Sabrina");

        // print every name
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("-------------");

        // print every second name
        for (int i = 0; i < names.size(); i += 2) {
            System.out.println(names.get(i));
        }


    }
}
