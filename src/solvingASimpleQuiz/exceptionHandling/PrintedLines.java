package src.solvingASimpleQuiz.exceptionHandling;

public class PrintedLines {
    public static void main(String[] args) {
        try {
            String s = null;
            char ch = s.charAt(10);
            System.out.println(ch);
        } catch (RuntimeException e) {
            System.out.println("A runtime exception occurred");
        } catch (Exception e) {
            System.out.println("An exception occurred");
        } finally {
            System.out.println("Finally!");
        }
    }
}
