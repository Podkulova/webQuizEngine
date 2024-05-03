package src.solvingASimpleQuiz.overloading.gettersAndSetters;

/*
Here's a class named Book. It has three fields: a string field title,
 an int field yearOfPublishing and an array of strings authors.

Write getters and setters for all fields.
 */
public class Book {
    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
}
