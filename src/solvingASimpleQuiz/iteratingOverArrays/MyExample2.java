package src.solvingASimpleQuiz.iteratingOverArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class MyExample2 {
    public static void main(String[] args) {
        // 1) Inicializace pole: Vytvoř pole s deseti celočíselnými hodnotami od 1 do 10.
        int[] pole = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 2) Výpis prvků pole: Vytiskni všechny prvky pole z prvního příkladu na konzoli.
        for (int i = 0; i < pole.length; i++) {
            //System.out.print(pole[i] + " ");
        }
         // 3) Součet prvků pole: Spočítej součet všech prvků pole z prvního příkladu.
        int soucet = 0;

        for (int cislo : pole) {
            soucet += cislo;
        }
        //System.out.println(soucet);

        // 4) Nalezení maximální hodnoty v poli: Najdi nejvyšší hodnotu v poli z prvního příkladu.
        int max = pole[0];

        for (int i = 1; i < pole.length; i++) {
            if (pole[i] > max) {
                max = pole[i];
            }
        }
        // System.out.println("Maximální hodnota pole je: " + max);

        // Řazení pole sestupně: Seřaď pole z prvního příkladu sestupne a vypiš ho na konzoli.
        Integer[] pole2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(pole2);

        // Otočí pořadí prvků pole
        Collections.reverse(Arrays.asList(pole2));

        System.out.println("Seřazené pole sestupně:");
        for (int razeni : pole2) {
            System.out.print(razeni + " ");
        }
    }
}
