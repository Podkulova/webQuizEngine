package src.solvingASimpleQuiz.multipleConstructors;

public class Vehicle {
    private String type;

    public Vehicle() {
        this.type = "Unknown";
    }

    public Vehicle(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle("Car");
        System.out.println(vehicle1.getType());
        System.out.println(vehicle2.getType());
    }
}
