package src.instanceMethod;

import java.util.Scanner;

/*
Vytvořte třídu Kalkulačka s instanční metodou nazvanou
vypočítat, která bere dvě celá čísla jako parametry a
vrací jejich součet. V hlavní metodě vytvořte instanci třídy Calculator, načtěte od uživatele dvě celá čísla, předejte je metodě výpočtu a vytiskněte výsledek.
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Calculator calculator = new Calculator();
        int result = calculator.calculate(num1, num2);
        System.out.println(result);
    }

    public int calculate(int a, int b) {
        return a + b;
    }

}
