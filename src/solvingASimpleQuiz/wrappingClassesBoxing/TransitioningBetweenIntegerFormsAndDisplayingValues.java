package src.solvingASimpleQuiz.wrappingClassesBoxing;

public class TransitioningBetweenIntegerFormsAndDisplayingValues {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(10);
        System.out.println("Boxed Integer: " + boxedInt);

        int unboxedInt = boxedInt.intValue();
        System.out.println("Unboxed Integer: " + unboxedInt);
    }
}
