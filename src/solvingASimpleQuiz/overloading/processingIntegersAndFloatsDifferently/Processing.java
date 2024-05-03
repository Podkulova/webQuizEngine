package src.solvingASimpleQuiz.overloading.processingIntegersAndFloatsDifferently;

public class Processing {
    public static int process(int num) {
        return num * num;
    }

    public static int process(float num) {
        return Math.round(num);
    }
}
