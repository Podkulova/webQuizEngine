package src.solvingASimpleQuiz.genericsAndObject;

/**
 * Object-based box class that requires casting every time you want to get some
 * specific stuff from it, e.g.:
 * <p>
 * Box cakeBox = new Box();
 * cakeBox.put(new Cake());
 * // Without casting only object can be retrieved out of the box
 * Cake cake = (Cake) cakeBox.get();
 * <p>
 * Casting is not desirable and can fall at runtime, could you create more... generic solution?
 */

class Box<T> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }

    static class Cake {
        private String name;

        public Cake(String name) {
            this.name = name;
        }

        public Cake() {

        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Box cakeBox = new Box();
        cakeBox.put(new Cake("Cake"));
        Cake cake = (Cake) cakeBox.get();
        System.out.println("The cake in the box is: " + cake.getName());
    }
}
