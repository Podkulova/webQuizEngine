package src.solvingASimpleQuiz.protectedModifier.tiggyTiger;

public class Tiger {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Rrrrrrr!");
    }

    protected void run() {
        System.out.println(this.name + " is running!");
    }
}
