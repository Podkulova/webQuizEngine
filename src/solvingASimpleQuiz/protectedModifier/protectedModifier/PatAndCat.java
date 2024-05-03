package src.solvingASimpleQuiz.protectedModifier.protectedModifier;

public class PatAndCat {
    class Animal {

        protected int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    class Pet extends Animal {

        protected String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

  class Cat extends Pet {

        protected String color;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    public void main(String[] args) {
        Pet cat = new Cat();
        //cat.getColor();
        cat.setAge(5);

        cat.getAge();

        cat.getName();

        cat.setName("Pharaoh");

       // cat.setColor("Šedá");
    }
}
