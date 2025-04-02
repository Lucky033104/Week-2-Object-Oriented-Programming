package Static;
public class Book {
    private final String isbn;
    private String title;
    private String author;
    static String libraryName = "Capgemini Library";
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void displayBookDetails() {
        if (this instanceof Book) {
            displayLibraryName();
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
        else {
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
        Book b1 = new Book("ISBN001", "Java Fundamentals", "James Gosling");
        Book b2 = new Book("ISBN002", "Python Basics", "Guido van Rossum");
        b1.displayBookDetails();
        System.out.println();
        b2.displayBookDetails();
    }
}

