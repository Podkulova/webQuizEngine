package src.solvingASimpleQuiz.overloading.arraysAsParameters;

public class PrintArray {
    public static void main(String[] args) {
        int[] array = {4, 3, 7, 8, 6, 2, 1};
        printArray(array);
    }

    public static void printArray(int[] inputArray) {
        for (int element : inputArray) {

            System.out.println("Element: " + element);
        }
    }
}
