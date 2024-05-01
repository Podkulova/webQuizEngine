package src.overloading.pr1;

import java.util.Scanner;

/*
Přetížení této metody jednou novou metodou. Metoda by měla přijmout inta vrátit maximální hodnotu typu intmínus daná hodnota.

U metody musí být typ výsledné hodnoty stejný jako typ parametru.*/

import static src.overloading.pr1.Overloading.getMaxMinusCurrent;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();

        switch (type) {
            case "long":
                final long longVal = Long.parseLong(scanner.nextLine());
                final long longResult = getMaxMinusCurrent(longVal);
                System.out.println(longResult);
                break;
            case "int":
                final int intVal = Integer.parseInt(scanner.nextLine());
                final int intResult = getMaxMinusCurrent(intVal);
                System.out.println(intResult);
                break;
            default:
                System.out.println("Unknown type found");
                break;
        }
    }
}
