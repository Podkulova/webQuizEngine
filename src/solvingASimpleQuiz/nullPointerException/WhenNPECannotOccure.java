package src.solvingASimpleQuiz.nullPointerException;

public class WhenNPECannotOccure {
    public static void main(String[] args) {
        String str = null;

        str.equals("abc");
        //str == null;
        "abc".equals(str);
        str.length();

    }
}
