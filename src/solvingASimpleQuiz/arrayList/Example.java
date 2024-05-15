package src.solvingASimpleQuiz.arrayList;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        System.out.println(names.size()); // 0

        names.add("Justin");      // [Justin]
        names.add("Helen");       // [Justin, Helen]
        names.add(1, "Joshua");   // [Justin, Joshua, Helen]
        names.add(0, "Laura");    // [Laura, Justin, Joshua, Helen]

        names.set(3, "Marie"); // now: [Laura, Justin, Joshua, Marie]

        System.out.println(names);        // [Laura, Justin, Joshua, Marie]
        System.out.println(names.size()); // 4
        System.out.println(names.get(0)); // the first element is "Laura"
        System.out.println(names.get(3)); // the last element is "Marie"

        names.remove("Justin"); // [Laura, Joshua, Marie]
        names.remove(1);        // [Laura, Marie]
        names.clear();          // []
    }
}
