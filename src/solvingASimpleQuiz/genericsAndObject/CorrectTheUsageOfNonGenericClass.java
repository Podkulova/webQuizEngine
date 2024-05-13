package src.solvingASimpleQuiz.genericsAndObject;

public class CorrectTheUsageOfNonGenericClass<T> {
    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}

class Main {
    public static void main(String... args) {
        CorrectTheUsageOfNonGenericClass holder = new CorrectTheUsageOfNonGenericClass();
        holder.set(256);

        // correct the line to make the code compile
        Integer value = (Integer) holder.get();

        // do not change
        System.out.println(value);
    }
}
