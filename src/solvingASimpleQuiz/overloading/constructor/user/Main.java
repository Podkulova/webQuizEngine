package src.solvingASimpleQuiz.overloading.constructor.user;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String login = scanner.nextLine();
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();

        User user = new User(login, firstName, lastName);
        System.out.println(user.toString());
    }
}
