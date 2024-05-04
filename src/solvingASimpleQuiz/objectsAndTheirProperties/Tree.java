package src.solvingASimpleQuiz.objectsAndTheirProperties;

/*
What is my age?
 */
public class Tree {
    String sort;
    int age;
    double height;
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = tree1;
        Tree tree3 = tree2;


        tree1 = new Tree();
        tree1.age = 5;
        tree2.age = 10;
        tree3 = null;

        System.out.println(tree1.age);
    }
}