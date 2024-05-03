package src.solvingASimpleQuiz.overloading.definingClasses;

import java.util.Scanner;
/*
Create a class named 'Book' with a title, author, and number of pages,
and provide methods to set and get these data. Next, in your main function,
create a new 'Book' instance and set the title and author as inputted from user
 input and set the number of pages to 100. Finally, print the book details in the
 following format: 'Title:
 */

public class CreatingBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        String author = sc.nextLine();

        Book book = new Book();

        // Set the details of the book
        // Implement here
        book.setTitle(title);
        book.setAuthor(author);
        book.setPages(100);

        // Print the details of the book
        // Implement here
        // Title: To Kill a Mockingbird, Author: Harper Lee, Pages: 100
        System.out.println("Title: " + book.getTitle() + ", " + "Author: " + book.getAuthor() + ", " + "Pages: " + book.getPages());
    }

    public static class Book {
        private String title;
        private String author;
        private int pages;

        // Getters and setters
        // Implement here

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getPages() {
            return pages = pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }
    }
}
