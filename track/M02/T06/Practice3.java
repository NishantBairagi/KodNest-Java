
import java.util.Scanner;

class Book {

    String title;
    String author;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Practice3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        Book b = new Book(author, title);
        b.display();
    }
}
