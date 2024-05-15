package src.solvingASimpleQuiz.collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Has it ever bothered you when unknown people call you and try to impose their services? That can be annoying.

Let's try to solve the problem by using a blacklist.
You should implement the filterPhones method that returns only the phone numbers that are not on the blacklist.

Tip: Choose appropriate method(s) of the Collection interface to solve this task.
 */
public class Blacklist {
    public static Collection<String> filterPhones(Collection<String> phones,
                                                  Collection<String> blacklist) {
        // write your code here
        return phones.stream()
                .filter(phone -> !blacklist.contains(phone))
                .collect(Collectors.toList());

    }

    /* Please, do not modify this I/O code */
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
            Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));

            Collection<String> nonBlockedPhones = Blacklist.filterPhones(
                    new ArrayList<>(phones), new ArrayList<>(blockList));

            System.out.println(nonBlockedPhones.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" ")));
        }
    }
}
