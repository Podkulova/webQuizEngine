package src.solvingASimpleQuiz.nullPointerException;

/*
Correct the code so it doesn't throw an exception.
 */
class UnknownInput {
    // correct this method to avoid NPE
    public static void printLength(String name) {
        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println("Name is null.");
        }
    }

    public static void main(String[] args) {
        String name = null;
        UnknownInput.printLength(name);
    }
}