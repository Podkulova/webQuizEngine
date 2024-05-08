package src.solvingASimpleQuiz.nullPointerException;

import java.util.Scanner;

/*
Your task is to fix the method concatStrings. The method should concat two strings and avoid NPE.

If both of the strings are null, you should return an empty string ("");
If only one string is null, you should return the other string.

Look at the examples:
 */
class AvoidNPEwithStrings {
    public static String concatStrings(String str1, String str2) {
        /* write your code here */
        if (str1 == null && str2 == null) {
            return "";
        } else if (str1 == null) {
            return str2;
        } else if (str2 == null) {
            return str1;
        } else {
            return str1.concat(str2);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        str1 = "null".equalsIgnoreCase(str1) ? null : str1;
        str2 = "null".equalsIgnoreCase(str2) ? null : str2;

        System.out.println(concatStrings(str1, str2));
    }
}
