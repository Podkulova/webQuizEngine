package src.constructor.introducingAPerson;

public class Person {
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Introduction(){
        System.out.println("Hello, my name is " + name +  " and I am " + age + " years old.");
    }
}
