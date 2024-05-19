package src.solvingASimpleQuiz.threadManagement;

public class VeganPizza {
    public static void cookVeganPizza() throws InterruptedException {
        Base base = new Base();
        Tomatoes tomatoes = new Tomatoes();
        Tomatoes.Tofu tofu = new Tomatoes.Tofu();
        Tomatoes.Bake bake = new Tomatoes.Bake();

// Start and join each step to ensure the correct order
        base.start();
        base.join();

        tomatoes.start();
        tomatoes.join();

        tofu.start();
        tofu.join();

        bake.start();
        bake.join();
    }
}

//Don't change the code below
class Base extends Thread {
    @Override
    public void run() {
        System.out.println("cook base");
    }
}

class Tomatoes extends Thread {
    @Override
    public void run() {
        for (int i = 3; i >= 1; i--) {
            System.out.println("slice tomatoes " + i);
        }
    }

    static class Tofu extends Thread {
        @Override
        public void run() {
            System.out.println("fry tofu");
        }
    }

    static class Bake extends Thread {
        @Override
        public void run() {
            for (int i = 4; i >= 0; i--) {
                if (i == 0) {
                    System.out.println("Your pizza is ready!");
                    break;
                }
                System.out.println("to bake..." + i + " min");

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        VeganPizza.cookVeganPizza();
    }
}

