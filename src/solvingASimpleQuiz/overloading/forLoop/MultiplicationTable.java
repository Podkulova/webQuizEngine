package src.solvingASimpleQuiz.overloading.forLoop;

/*Below is an unfinished program that should output the 10x10 multiplication table.
However, some parts are missing. Complete the program so that the printed result will look like this:*/
public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
