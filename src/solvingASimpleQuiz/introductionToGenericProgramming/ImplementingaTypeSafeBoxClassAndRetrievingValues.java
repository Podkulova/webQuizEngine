package src.solvingASimpleQuiz.introductionToGenericProgramming;

import java.util.Scanner;

/*
Create a type-safe Box class that has a single instance variable for the type it's defined with, alongside appropriate constructor.
 Implement a method named 'get' that will return the value. Then, you will be provided with a string, integer or a float.
 Your task is to use the Box class, put the value provided into an object of Box and then return that value.
 Note that the box can hold any data type.
The input will be a single line of either string, integer or float and your output should be the same value.
 */
public class ImplementingaTypeSafeBoxClassAndRetrievingValues {
    static class Box<T> {
        // your code here
        private T value;

        public Box(T value) {
            this.value = value;
        }

        public T get() {
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            // your code here
            Box<Integer> intBox = new Box<>(num);
            System.out.println(intBox.get());
        } else if (sc.hasNextFloat()) {
            float num = sc.nextFloat();
            // your code here
            Box<Float> floatBox = new Box<>(num);
            System.out.println(floatBox.get());
        } else {
            String str = sc.next();
            // your code here
            Box<String> stringBox = new Box<>(str);
            System.out.println(stringBox.get());
        }
    }
}
