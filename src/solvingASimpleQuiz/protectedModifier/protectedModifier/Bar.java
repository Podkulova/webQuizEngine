package src.solvingASimpleQuiz.protectedModifier.protectedModifier;

public class Bar extends Foo {
    public static void main(String[] args) {
        Foo fooObj = new Foo();
        System.out.println(fooObj.x);
    }
}
