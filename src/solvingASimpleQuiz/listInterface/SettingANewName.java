package src.solvingASimpleQuiz.listInterface;

import java.util.List;

import static java.lang.reflect.Array.set;

/*
What happens if someone invokes the set(0, "Mary") method on this list?
 */
public class SettingANewName {
    public static void main(String[] args) {

        List<String> names = List.of("Larry", "Kenny", "Sabrina");

        //set(0, "Mary");
    }
}
