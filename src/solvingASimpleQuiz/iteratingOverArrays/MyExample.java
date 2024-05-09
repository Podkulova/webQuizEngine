package src.solvingASimpleQuiz.iteratingOverArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyExample {
    public static void main(String[] args) {

        // 1) Inicializace pole: Vytvoř pole celých čísel s následujícími hodnotami: 1, 2, 3, 4, 5.
        int[] array = {1, 2, 3, 4, 5};


        // 2) Výpis prvků pole: Vytiskni všechny prvky pole z prvního příkladu na konzoli.
        for (int i = 0; i < array.length; i++) {
            //System.out.print("Výpis prvků pole: " + array[i]);
        }

        // 3) Součet prvků pole: Spočítej součet všech prvků pole z prvního příkladu.
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        //System.out.println("Součet prvků pole: " + sum);

        // 4) Nalezení maximální hodnoty v poli: Najdi nejvyšší hodnotu v poli z prvního příkladu.
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        //System.out.println("Nalezení maximální hodnoty v poli: " + max);


        // 5) Zkopírování pole: Vytvoř kopii pole z prvního příkladu a vytiskni ji na konzoli.
        int[] copyArray = new int[array.length];

        // vytvroření kopie pole
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }

        // výpis pole
        // System.out.println("Kopie pole:");
        for (int cislo : copyArray) {
            // System.out.print(cislo + " ");
        }

        // 6) Řazení pole vzestupně: Seřaď pole vzestupně a vypiš ho na konzoli.
        int[] pole = {5, 4, 3, 2, 1};
        Arrays.sort(pole);

        // System.out.println("Seřazené pole vzestupně:");
        for (int cislo : pole) {
            // System.out.print(cislo + " ");
        }

        // 7) Hledání prvků v poli: Vytvoř pole s následujícími hodnotami: 10, 20, 30, 40, 50.
        // Potom projdi toto pole a zkontroluj, zda číslo 30 je v něm obsaženo.
        int[] pole2 = {10, 20, 30, 40, 50};

        boolean nalezeno = false;

        for (int i = 0; i < pole2.length; i++) {
            if (pole2[i] == 30) {
                nalezeno = true;
                //   System.out.println("Našel jsem pole s hodnoutou " + pole2[i] + ".");
                break;
            }
        }

        if (!nalezeno) {
            // System.out.println("Takové číslo tady není.");
        }

        // 8) Spojení dvou polí: Vytvoř pole s hodnotami 1, 2, 3 a pole s hodnotami 4, 5, 6.
        // Potom spoj obě pole do jednoho a vypiš ho na konzoli.

        int[] number1 = {1, 2, 3};
        int[] number2 = {4, 5, 6};

        int[] spojenePole = new int[number1.length + number2.length];

        // Kopírování prvků z prvního pole do spojeného pole
        System.arraycopy(number1, 0, spojenePole, 0, number1.length);

        // Kopírování prvků z druhého pole do spojeného pole
        System.arraycopy(number2, 0, spojenePole, number1.length, number2.length);

        for (int cislo : spojenePole) {
            // System.out.print(cislo + " ");
        }

        // 9) Výpočet průměru prvků pole: Vypočti průměr prvků pole s hodnotami 10, 20, 30, 40, 50.
        int[] hodnoty = {10, 20, 30, 40, 50};

        int sum2 = 0;

        for (int hodnota : hodnoty) {
            sum2 += hodnota;
        }

        double prumer = (double) sum2 / hodnoty.length;

        // System.out.println("Průměr prvků pole je: " + prumer);

        // 10) Hledání duplicitních prvků: Vytvoř pole s hodnotami 1, 2, 3, 2, 4, 5, 4.
        // Potom projdi toto pole a najdi všechny duplicity.

        int[] cisla = {1, 2, 3, 2, 4, 5, 4};

        // Vytvoření seznamu pro ukládání nalezených duplicit
        List<Integer> duplicity = new ArrayList<>();

        // Projdi všechny prvky pole
        for (int i = 0; i < cisla.length; i++) {
            // Pro každý prvek porovnej ho s ostatními prvky
            for (int j = i + 1; j < cisla.length; j++) {
                // Pokud jsou prvky stejné a ještě nejsou v seznamu duplicit, přidej je
                if (cisla[i] == cisla[j] && !duplicity.contains(cisla[i])) {
                    duplicity.add(cisla[i]);
                }
            }
        }

        // Vypiš nalezené duplicity
        System.out.println("Duplicity v poli jsou: " + duplicity);
    }
}