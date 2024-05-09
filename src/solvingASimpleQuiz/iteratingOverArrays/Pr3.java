package src.solvingASimpleQuiz.iteratingOverArrays;

public class Pr3 {
    public static void main(String[] args) {
        char[] characters = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };

        int counter = 0;
        for (char ch : characters) {
            if (ch == 'a') {
                counter++;
            }
        }

        System.out.println(counter); // it outputs "3"

        char[] characters2 = {'a', 'b', 'c', 'a', 'b', 'c', 'a'};

        int counter2 = 0;
        for (int i = 0; i < characters2.length; i++) {
            if (characters2[i] == 'a') {
                counter2++;
            }
        }

        System.out.println(counter2); // it outputs "3"
    }
}
