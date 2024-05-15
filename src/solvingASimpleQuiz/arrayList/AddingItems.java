package src.solvingASimpleQuiz.arrayList;

import java.util.ArrayList;

/*
What will characters contain after running this code?
 */
public class AddingItems {
    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('a');
        characters.add('b');
        characters.add(1, 'c');
        characters.add(1, 'd');
        characters.add('e');
        characters.add(5, 'f');

        System.out.println(characters);
    }
}
