package src.solvingASimpleQuiz.iteratingOverArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

        //System.out.println("Seřazené pole sestupně:");
        for (int razeni : pole2) {
            //System.out.print(razeni + " ");
        }

        // Hledání prvků v poli: Vytvoř pole s následujícími hodnotami: 10, 20, 30, 40, 50.
        // Potom projdi toto pole a zkontroluj, zda číslo 20 je v něm obsaženo.
        int[] hodnoty = {10, 20, 30, 40, 50};

        boolean nalezno = false;

        for (int i = 0; i < hodnoty.length; i++) {
            if (hodnoty[i] == 20) {
                nalezno = true;
                // System.out.println("Nalezená hodnota v poli je: " + hodnoty[i] + ".");
                break;
            }
        }

        if (!nalezno) {
            // System.out.println("Takové číslo zde není.");
        }

        // Spojení dvou polí: Vytvoř pole s hodnotami 8, 9, 10 a pole s hodnotami 4, 5, 6, 7.
        // Potom spoj obě pole do jednoho a vypiš ho na konzoli.
        int[] poleA = {8, 9, 10};
        int[] poleB = {4, 5, 6, 7};

        int[] spojenePole = new int[poleB.length + poleA.length];

        System.arraycopy(poleA, 0, spojenePole, poleB.length, poleA.length);
        System.arraycopy(poleB, 0, spojenePole, 0, poleB.length);

        for (int spojeni : spojenePole) {
            //System.out.print(spojeni + " ");
        }

        // Výpočet průměru prvků pole: Vypočti průměr prvků pole s hodnotami 15, 20, 25, 40, 50.
        int[] polePrumeru = {15, 20, 25, 40, 50};

        int soucetPole = 0;

        for (int prvek : polePrumeru) {
            soucetPole += prvek;
        }

        int prumer = soucetPole / polePrumeru.length;
        System.out.println(prumer);
    }
}
