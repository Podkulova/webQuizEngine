package src.solvingASimpleQuiz.nullPointerException;

/*
Suppose you have a variable named s of the String type.

In which cases NPE may occur?
 */
public class WhereNPEmayOccur {
    public static void main(String[] args) {

        String s;

        String str = null;
        s = str;

       // String result = s.concat("100");

        "abc".equals(s);

       // s.equals("abc");
    }
}
