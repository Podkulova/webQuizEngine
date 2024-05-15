package src.solvingASimpleQuiz.arrayList;

import java.util.ArrayList;

public class Example3 {
    public static void main(String[] args) {

        ArrayList<Long> powersOfTen = new ArrayList<>();

        int count = 5;
        for (int i = 0; i < count; i++) {
            long power = (long) Math.pow(10, i);
            powersOfTen.add(power);
        }

        for (Long value : powersOfTen) {
            System.out.print(value + " ");
        }

    }
}
