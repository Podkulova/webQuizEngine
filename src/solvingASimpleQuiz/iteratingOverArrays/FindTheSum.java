package src.solvingASimpleQuiz.iteratingOverArrays;

/*
Select all correct ways to find the sum of integer numbers in the array numbers.
 */
public class FindTheSum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 1)
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("Sum using method a): " + sum);
        }
        //2)
        int sum2 = 0;
        for (int i = 1; i < numbers.length; i++) {
            sum2 += numbers[i];
            System.out.println("Sum using method b): " + sum2);
        }
        //3)
        int sum3 = 0;
        for (int number : numbers) {
            sum3 += number;
            System.out.println("Sum using method c): " + sum3);
        }
        // 4)
        /*int sum4 = 0;
        for (int i = 0; i <= numbers.length; i++) {
            sum4 += numbers[i];
        }*/
    }
}
