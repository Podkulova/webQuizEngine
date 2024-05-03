package src.solvingASimpleQuiz.overloading.declaringMethods;

import java.util.Scanner;

/*
Implementujte metodu, která kontroluje, zda je dané anglické písmeno samohláskou či nikoli.
Vstup může být v každém případě.

V našem případě se písmeno 'y' nepovažuje za samohlásku.
*/

public class VowelOrNot {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            char letter = scanner.nextLine().charAt(0);
            System.out.println(isVowel(letter) ? "YES" : "NO");
        }
    public static boolean isVowel(char ch) {
        // Převedeme písmeno na malé písmeno
        ch = Character.toLowerCase(ch);

        // samohlásky v anglickém jazyce
        String vowels = "aeiou";

        //Kontrola, zda je zadané písmeno v řetězci samohlásek
        return vowels.contains(String.valueOf(ch));
    }
}
