package src.solvingASimpleQuiz.setInterface;

public class TreeSetElementsOrder {
    public static void main(String[] args) {

            java.util.TreeSet<Integer> treeSet = new java.util.TreeSet<>();

            for (int i = 15; i > 5; i--) {
                treeSet.add(i);
            }
            System.out.println(treeSet);
    }
}
