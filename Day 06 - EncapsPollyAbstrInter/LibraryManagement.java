package EncapsPollyAbstrInter;

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public String getItemId() {
        return itemId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    public abstract int getLoanDuration();
}
class Book extends LibraryItem implements Reservable {
    private boolean available;
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
    }
    @Override
    public int getLoanDuration() {
        return 14;
    }
    @Override
    public void reserveItem() {
        if (available) {
            System.out.println("Book " + getTitle() + " has been reserved.");
            available = false;
        } else {
            System.out.println("Book " + getTitle() + " is not available for reservation.");
        }
    }
    @Override
    public boolean checkAvailability() {
        return available;
    }
}
class Magazine extends LibraryItem implements Reservable {
    private boolean available;
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
    }
    @Override
    public int getLoanDuration() {
        return 7;
    }
    @Override
    public void reserveItem() {
        if (available) {
            System.out.println("Magazine " + getTitle() + " has been reserved.");
            available = false;
        } else {
            System.out.println("Magazine " + getTitle() + " is not available for reservation.");
        }
    }
    @Override
    public boolean checkAvailability() {
        return available;
    }
}
class DVD extends LibraryItem implements Reservable {
    private boolean available;
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
    }
    @Override
    public int getLoanDuration() {
        return 3;
    }
    @Override
    public void reserveItem() {
        if (available) {
            System.out.println("DVD " + getTitle() + " has been reserved.");
            available = false;
        } else {
            System.out.println("DVD " + getTitle() + " is not available for reservation.");
        }
    }
    @Override
    public boolean checkAvailability() {
        return available;
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        LibraryItem book = new Book("B654", "Java", "Atlee");
        LibraryItem magazine = new Magazine("M290", "Tech Today", "Elon Musk");
        LibraryItem dvd = new DVD("D639", "Mission Possible", "Tom Cruise");
        LibraryItem[] items = {book, magazine, dvd};
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("------------");
        }
        Reservable reservableBook = (Reservable) book;
        reservableBook.reserveItem();
        System.out.println("Is Book Available: " + ((Reservable) book).checkAvailability());
        Reservable reservableMagazine = (Reservable) magazine;
        reservableMagazine.reserveItem();
        System.out.println("Is Magazine Available: " + ((Reservable) magazine).checkAvailability());
        Reservable reservableDvd = (Reservable) dvd;
        reservableDvd.reserveItem();
        System.out.println("Is DVD Available: " + ((Reservable) dvd).checkAvailability());
    }
}

