package src.solvingASimpleQuiz.KeywordSuper;

import javax.swing.border.StrokeBorder;

public class Employees {
    // write fields
    private String name;
    private String email;
    private int experience;

    // write constructor
    public Employees(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    // write getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }
}

class Developer extends Employees {
    // write fields
    private String mainLanguage;
    private String[] skills;

    // write constructor

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    // write getters
    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }
}

class DataAnalyst extends Employees {
    // write fields
    private boolean phd;
    private String[] methods;

    // write constructor
    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    // write getters
    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }

    public static void main(String[] args) {
        String[] skills = { "git", "Scala", "JBoss", "UML" };
        Employees developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

        String[] methods = { "neural networks", "decision tree", "bayesian algorithms" };
        Employees analyst = new DataAnalyst("John", "john@gmail.com", 2, true, methods);
    }
}

